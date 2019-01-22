package com.esdemo;

public class AccessInfoModel {
	@Override
	public String toString() {
		return "AccessInfoModel{" +
				"id='" + id + '\'' +
				", conid='" + conid + '\'' +
				", userid='" + userid + '\'' +
				", success='" + success + '\'' +
				", channel='" + channel + '\'' +
				", starttime='" + starttime + '\'' +
				", endtime='" + endtime + '\'' +
				", errormsg='" + errormsg + '\'' +
				", arg='" + arg + '\'' +
				", rspmsg='" + rspmsg + '\'' +
				", samnum='" + samnum + '\'' +
				", num='" + num + '\'' +
				", accessnum='" + accessnum + '\'' +
				", phonemodel='" + phonemodel + '\'' +
				", appid='" + appid + '\'' +
				", time='" + time + '\'' +
				", versions='" + versions + '\'' +
				", appname='" + appname + '\'' +
				", url='" + url + '\'' +
				", path='" + path + '\'' +
				", msg='" + msg + '\'' +
				", state='" + state + '\'' +
				", appchname='" + appchname + '\'' +
				", starttime_start='" + starttime_start + '\'' +
				", starttime_end='" + starttime_end + '\'' +
				", apiname='" + apiname + '\'' +
				", clientip='" + clientip + '\'' +
				", opersystem='" + opersystem + '\'' +
				'}';
	}

	private String id;      		//主键
	private String conid;      		//接口关系表主键
	private String userid;      	//用户id
	private String success;      	//是否成功
	private String channel;      	//访问渠道
	private String starttime;      	//访问开始时间
	private String endtime;      	//访问结束时间
	private String errormsg;      	//错误信息
	private String arg;      		//参数
	private String rspmsg;      	//返回结果
	private String samnum;      	//访问接口总数量
	private String num;      		//返访问接口失败数量
	private String accessnum;		//访问总数量 
	private String phonemodel;		//
	private String appid;			//

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getPhonemodel() {
		return phonemodel;
	}

	public void setPhonemodel(String phonemodel) {
		this.phonemodel = phonemodel;
	}

	public String getAccessnum() {
		return accessnum;
	}

	public void setAccessnum(String accessnum) {
		this.accessnum = accessnum;
	}

	public String getApiname() {
		return apiname;
	}

	public void setApiname(String apiname) {
		this.apiname = apiname;
	}

	private String time;      		//时间戳
	private String versions;        //版本
	private String appname;        //应用名称
	private String url;            //请求地址
	private String path;           //访问地址
	private String msg;              //统一返回信息
	private String state;            //是否可用
	private String appchname;        //应用中文名称
	private String starttime_start;   //访问开始时间起
	private String starttime_end;    //访问开始时间止
	private String apiname; //接口名称
	private String clientip;//客户端ip
	private String opersystem;//客户端操作系统

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public String getOpersystem() {
		return opersystem;
	}

	public void setOpersystem(String opersystem) {
		this.opersystem = opersystem;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConid() {
		return conid;
	}
	public void setConid(String conid) {
		this.conid = conid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public String getArg() {
		return arg;
	}
	public void setArg(String arg) {
		this.arg = arg;
	}
	public String getRspmsg() {
		return rspmsg;
	}
	public void setRspmsg(String rspmsg) {
		this.rspmsg = rspmsg;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getVersions() {
		return versions;
	}
	public void setVersions(String versions) {
		this.versions = versions;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAppchname() {
		return appchname;
	}
	public void setAppchname(String appchname) {
		this.appchname = appchname;
	}
	public String getStarttime_start() {
		return starttime_start;
	}
	public void setStarttime_start(String starttime_start) {
		this.starttime_start = starttime_start;
	}
	public String getStarttime_end() {
		return starttime_end;
	}
	public void setStarttime_end(String starttime_end) {
		this.starttime_end = starttime_end;
	}

	public String getSamnum() {
		return samnum;
	}

	public void setSamnum(String samnum) {
		this.samnum = samnum;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}
