package com.test;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.*;

public class jwd {
    static String driver = "oracle.jdbc.driver.OracleDriver";    //������ʶ��
    static String url = "jdbc:oracle:thin:@172.22.0.84:1521:devdb"; //�����ַ���
    // url ="jdbc:oracle:thin:@10.0.30.64:1521:orcl";  // ����Զ�̵����ݿ������ôд
    static String user = "xysyx";         //���ݿ���û���
    static String password = "xysyx";     //���ݿ������
    static Connection con = null;
    static PreparedStatement pstm_update=null;
    static PreparedStatement pstm = null;
    static ResultSet rs = null;
    static PreparedStatement insertPrepare = null;

    public static void main(String[] args) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
//            String sql = "select a.address_id,a.address from qjh_info a where a.address  not like '%����%' and a.lng is  null";
            String sql="select building,address_id,state from (select case when a.building is not null then a.building else a.ADDRESS end building,lng,lat,address_id,state from qjh_info a where  a.state is null and a.building is not null or  a.address like '%����%') b\n";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            int num = 0;
            while (rs.next()) {
                num++;
                String address = rs.getString(1);
                String Newaddress="������"+address;
                String id=rs.getString(2);
                String jsonStr=getLngAndLat(Newaddress);
                //����json�ַ���
                if(jsonStr==null){
                    continue;
                }
                JSONObject aJson = new JSONObject(jsonStr);
                JSONObject dJson = (JSONObject) aJson.get("data");
                JSONObject locJson = (JSONObject) dJson.get("location");
                String lng =locJson.getString("lng");
                String lat =locJson.getString("lat");
                System.out.println("��ַ="+ address);
                System.out.println("����="+ lng);
                System.out.println("�S��="+ lat);
                saveData(lng,lat,id);

            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String getLngAndLat(String address){
        try {
            Document doc = Jsoup.connect("http://172.22.0.24:9090/addreaatobdlng/gotoAddreaaToBdLng?address="+ URLEncoder.encode(address)).timeout(10000).get();
            return doc.text();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public static void  saveData(String lng,String lat,String id) throws SQLException, SQLException {
            String updateSql = "update qjh_info set lng=? ,lat=?,state=? where address_id=? ";
            con = DriverManager.getConnection(url, user, password);
            pstm_update = con.prepareStatement(updateSql);
            try {
                pstm_update.setString(1, lng);
                pstm_update.setString(2, lat);
                pstm_update.setString(3, "���");
                pstm_update.setString(4, id);
                pstm_update.executeUpdate();
            }catch (Exception e){

            }finally {
                pstm_update.close();
                con.close();
            }
  }
}
