package com.ocr.test;

import com.ocr.ocrbeans.bd.beans.Ocr_Bean;
import com.ocr.ocrbeans.bd.beans.Ocr_Chars_Location;
import com.ocr.ocrbeans.bd.beans.Ocr_words_result;
import com.google.gson.Gson;
import com.ocr.utils.General;

import java.io.IOException;
import java.util.*;

public class BeanStringOptimize {
    public static void main(String[] args) throws IOException {
        //
        Ocr_Bean bean = new Gson().fromJson("{\"log_id\": 1244322826254885128, \"direction\": 0, \"words_result_num\": 23, \"words_result\": [{\"vertexes_location\": [{\"y\": 1372, \"x\": 1982}, {\"y\": 1372, \"x\": 2295}, {\"y\": 1539, \"x\": 2295}, {\"y\": 1539, \"x\": 1982}], \"probability\": {\"variance\": 0.000433, \"average\": 0.978669, \"min\": 0.957871}, \"char1s\": [{\"char1\": \"永\", \"location\": {\"width\": 159, \"top\": 1372, \"left\": 1982, \"height\": 173}}, {\"char1\": \"庆\", \"location\": {\"width\": 103, \"top\": 1372, \"left\": 2139, \"height\": 173}}], \"min_finegrained_vertexes_location\": [{\"y\": 1372, \"x\": 1982}, {\"y\": 1372, \"x\": 2295}, {\"y\": 1539, \"x\": 2295}, {\"y\": 1539, \"x\": 1982}], \"finegrained_vertexes_location\": [{\"y\": 1372, \"x\": 1982}, {\"y\": 1372, \"x\": 2157}, {\"y\": 1372, \"x\": 2295}, {\"y\": 1458, \"x\": 2295}, {\"y\": 1539, \"x\": 2295}, {\"y\": 1539, \"x\": 2121}, {\"y\": 1539, \"x\": 1982}, {\"y\": 1451, \"x\": 1982}], \"location\": {\"width\": 319, \"top\": 1372, \"left\": 1982, \"height\": 173}, \"words\": \"永庆\"}, {\"vertexes_location\": [{\"y\": 1534, \"x\": 1975}, {\"y\": 1534, \"x\": 2290}, {\"y\": 1701, \"x\": 2290}, {\"y\": 1701, \"x\": 1975}], \"probability\": {\"variance\": 0.0, \"average\": 0.999976, \"min\": 0.999962}, \"char1s\": [{\"char1\": \"甄\", \"location\": {\"width\": 101, \"top\": 1534, \"left\": 2027, \"height\": 171}}, {\"char1\": \"选\", \"location\": {\"width\": 101, \"top\": 1534, \"left\": 2130, \"height\": 171}}], \"min_finegrained_vertexes_location\": [{\"y\": 1534, \"x\": 1975}, {\"y\": 1534, \"x\": 2290}, {\"y\": 1701, \"x\": 2290}, {\"y\": 1701, \"x\": 1975}], \"finegrained_vertexes_location\": [{\"y\": 1534, \"x\": 1975}, {\"y\": 1534, \"x\": 2148}, {\"y\": 1534, \"x\": 2290}, {\"y\": 1622, \"x\": 2290}, {\"y\": 1701, \"x\": 2290}, {\"y\": 1701, \"x\": 2119}, {\"y\": 1701, \"x\": 1975}, {\"y\": 1613, \"x\": 1975}], \"location\": {\"width\": 321, \"top\": 1534, \"left\": 1975, \"height\": 171}, \"words\": \"甄选\"}, {\"vertexes_location\": [{\"y\": 1946, \"x\": 1332}, {\"y\": 1946, \"x\": 1851}, {\"y\": 2065, \"x\": 1851}, {\"y\": 2065, \"x\": 1332}], \"probability\": {\"variance\": 0.0, \"average\": 0.99983, \"min\": 0.999456}, \"char1s\": [{\"char1\": \"营\", \"location\": {\"width\": 76, \"top\": 1946, \"left\": 1332, \"height\": 123}}, {\"char1\": \"养\", \"location\": {\"width\": 74, \"top\": 1946, \"left\": 1444, \"height\": 123}}, {\"char1\": \"成\", \"location\": {\"width\": 74, \"top\": 1946, \"left\": 1557, \"height\": 123}}, {\"char1\": \"分\", \"location\": {\"width\": 74, \"top\": 1946, \"left\": 1669, \"height\": 123}}, {\"char1\": \"表\", \"location\": {\"width\": 74, \"top\": 1946, \"left\": 1743, \"height\": 123}}], \"min_finegrained_vertexes_location\": [{\"y\": 1946, \"x\": 1332}, {\"y\": 1946, \"x\": 1851}, {\"y\": 2065, \"x\": 1851}, {\"y\": 2065, \"x\": 1332}], \"finegrained_vertexes_location\": [{\"y\": 1946, \"x\": 1332}, {\"y\": 1946, \"x\": 1458}, {\"y\": 1946, \"x\": 1581}, {\"y\": 1946, \"x\": 1705}, {\"y\": 1946, \"x\": 1829}, {\"y\": 1946, \"x\": 1851}, {\"y\": 2009, \"x\": 1851}, {\"y\": 2065, \"x\": 1851}, {\"y\": 2065, \"x\": 1728}, {\"y\": 2065, \"x\": 1604}, {\"y\": 2065, \"x\": 1480}, {\"y\": 2065, \"x\": 1356}, {\"y\": 2065, \"x\": 1332}, {\"y\": 2004, \"x\": 1332}], \"location\": {\"width\": 524, \"top\": 1946, \"left\": 1332, \"height\": 123}, \"words\": \"营养成分表\"}, {\"vertexes_location\": [{\"y\": 2162, \"x\": 933}, {\"y\": 2162, \"x\": 1073}, {\"y\": 2250, \"x\": 1073}, {\"y\": 2250, \"x\": 933}], \"probability\": {\"variance\": 0.0, \"average\": 0.999993, \"min\": 0.999986}, \"char1s\": [{\"char1\": \"项\", \"location\": {\"width\": 56, \"top\": 2162, \"left\": 933, \"height\": 92}}, {\"char1\": \"目\", \"location\": {\"width\": 56, \"top\": 2162, \"left\": 1017, \"height\": 92}}], \"min_finegrained_vertexes_location\": [{\"y\": 2162, \"x\": 933}, {\"y\": 2162, \"x\": 1073}, {\"y\": 2250, \"x\": 1073}, {\"y\": 2250, \"x\": 933}], \"finegrained_vertexes_location\": [{\"y\": 2162, \"x\": 933}, {\"y\": 2162, \"x\": 1026}, {\"y\": 2162, \"x\": 1073}, {\"y\": 2207, \"x\": 1073}, {\"y\": 2250, \"x\": 1073}, {\"y\": 2250, \"x\": 981}, {\"y\": 2250, \"x\": 933}, {\"y\": 2205, \"x\": 933}], \"location\": {\"width\": 144, \"top\": 2162, \"left\": 933, \"height\": 92}, \"words\": \"项目\"}, {\"vertexes_location\": [{\"y\": 2115, \"x\": 1410}, {\"y\": 2115, \"x\": 2286}, {\"y\": 2227, \"x\": 2286}, {\"y\": 2227, \"x\": 1410}], \"probability\": {\"variance\": 0.027389, \"average\": 0.90435, \"min\": 0.584536}, \"char1s\": [{\"char1\": \"每\", \"location\": {\"width\": 72, \"top\": 2115, \"left\": 1410, \"height\": 117}}, {\"char1\": \"1\", \"location\": {\"width\": 60, \"top\": 2115, \"left\": 1469, \"height\": 117}}, {\"char1\": \"0\", \"location\": {\"width\": 58, \"top\": 2115, \"left\": 1505, \"height\": 117}}, {\"char1\": \"0\", \"location\": {\"width\": 58, \"top\": 2115, \"left\": 1577, \"height\": 117}}, {\"char1\": \"克\", \"location\": {\"width\": 72, \"top\": 2115, \"left\": 1660, \"height\": 117}}, {\"char1\": \"(\", \"location\": {\"width\": 60, \"top\": 2115, \"left\": 1719, \"height\": 117}}, {\"char1\": \"g\", \"location\": {\"width\": 60, \"top\": 2115, \"left\": 1793, \"height\": 117}}, {\"char1\": \")\", \"location\": {\"width\": 60, \"top\": 2115, \"left\": 1865, \"height\": 117}}, {\"char1\": \"N\", \"location\": {\"width\": 58, \"top\": 2115, \"left\": 2045, \"height\": 117}}, {\"char1\": \"R\", \"location\": {\"width\": 60, \"top\": 2115, \"left\": 2115, \"height\": 117}}, {\"char1\": \"V\", \"location\": {\"width\": 58, \"top\": 2115, \"left\": 2153, \"height\": 117}}, {\"char1\": \"%\", \"location\": {\"width\": 60, \"top\": 2115, \"left\": 2189, \"height\": 117}}], \"min_finegrained_vertexes_location\": [{\"y\": 2115, \"x\": 1410}, {\"y\": 2115, \"x\": 2286}, {\"y\": 2227, \"x\": 2286}, {\"y\": 2227, \"x\": 1410}], \"finegrained_vertexes_location\": [{\"y\": 2115, \"x\": 1410}, {\"y\": 2115, \"x\": 1530}, {\"y\": 2115, \"x\": 1649}, {\"y\": 2115, \"x\": 1766}, {\"y\": 2115, \"x\": 1885}, {\"y\": 2115, \"x\": 2004}, {\"y\": 2115, \"x\": 2124}, {\"y\": 2115, \"x\": 2243}, {\"y\": 2115, \"x\": 2286}, {\"y\": 2173, \"x\": 2286}, {\"y\": 2227, \"x\": 2286}, {\"y\": 2227, \"x\": 2169}, {\"y\": 2227, \"x\": 2049}, {\"y\": 2227, \"x\": 1930}, {\"y\": 2227, \"x\": 1811}, {\"y\": 2227, \"x\": 1692}, {\"y\": 2227, \"x\": 1575}, {\"y\": 2227, \"x\": 1455}, {\"y\": 2227, \"x\": 1410}, {\"y\": 2169, \"x\": 1410}], \"location\": {\"width\": 879, \"top\": 2115, \"left\": 1410, \"height\": 117}, \"words\": \"每100克(g)NRV%\"}, {\"vertexes_location\": [{\"y\": 2281, \"x\": 931}, {\"y\": 2281, \"x\": 1082}, {\"y\": 2371, \"x\": 1082}, {\"y\": 2371, \"x\": 931}], \"probability\": {\"variance\": 0.0, \"average\": 0.999818, \"min\": 0.999657}, \"char1s\": [{\"char1\": \"能\", \"location\": {\"width\": 56, \"top\": 2281, \"left\": 931, \"height\": 94}}, {\"char1\": \"量\", \"location\": {\"width\": 58, \"top\": 2281, \"left\": 1014, \"height\": 94}}], \"min_finegrained_vertexes_location\": [{\"y\": 2281, \"x\": 931}, {\"y\": 2281, \"x\": 1082}, {\"y\": 2371, \"x\": 1082}, {\"y\": 2371, \"x\": 931}], \"finegrained_vertexes_location\": [{\"y\": 2281, \"x\": 931}, {\"y\": 2281, \"x\": 1026}, {\"y\": 2281, \"x\": 1082}, {\"y\": 2328, \"x\": 1082}, {\"y\": 2371, \"x\": 1082}, {\"y\": 2371, \"x\": 987}, {\"y\": 2371, \"x\": 931}, {\"y\": 2324, \"x\": 931}], \"location\": {\"width\": 155, \"top\": 2281, \"left\": 931, \"height\": 94}, \"words\": \"能量\"}, {\"vertexes_location\": [{\"y\": 2259, \"x\": 1363}, {\"y\": 2225, \"x\": 2288}, {\"y\": 2328, \"x\": 2292}, {\"y\": 2360, \"x\": 1365}], \"probability\": {\"variance\": 4.5e-05, \"average\": 0.995841, \"min\": 0.974921}, \"char1s\": [{\"char1\": \"2\", \"location\": {\"width\": 56, \"top\": 2254, \"left\": 1383, \"height\": 110}}, {\"char1\": \"6\", \"location\": {\"width\": 56, \"top\": 2254, \"left\": 1417, \"height\": 110}}, {\"char1\": \"5\", \"location\": {\"width\": 56, \"top\": 2252, \"left\": 1449, \"height\": 110}}, {\"char1\": \"0\", \"location\": {\"width\": 58, \"top\": 2250, \"left\": 1512, \"height\": 110}}, {\"char1\": \"千\", \"location\": {\"width\": 69, \"top\": 2247, \"left\": 1588, \"height\": 110}}, {\"char1\": \"焦\", \"location\": {\"width\": 69, \"top\": 2245, \"left\": 1653, \"height\": 110}}, {\"char1\": \"(\", \"location\": {\"width\": 58, \"top\": 2243, \"left\": 1707, \"height\": 110}}, {\"char1\": \"k\", \"location\": {\"width\": 58, \"top\": 2241, \"left\": 1775, \"height\": 110}}, {\"char1\": \"J\", \"location\": {\"width\": 56, \"top\": 2241, \"left\": 1806, \"height\": 108}}, {\"char1\": \")\", \"location\": {\"width\": 56, \"top\": 2238, \"left\": 1872, \"height\": 108}}, {\"char1\": \"3\", \"location\": {\"width\": 58, \"top\": 2229, \"left\": 2099, \"height\": 110}}, {\"char1\": \"2\", \"location\": {\"width\": 58, \"top\": 2227, \"left\": 2164, \"height\": 110}}, {\"char1\": \"%\", \"location\": {\"width\": 58, \"top\": 2227, \"left\": 2198, \"height\": 108}}], \"min_finegrained_vertexes_location\": [{\"y\": 2256, \"x\": 1361}, {\"y\": 2223, \"x\": 2288}, {\"y\": 2328, \"x\": 2292}, {\"y\": 2360, \"x\": 1363}], \"finegrained_vertexes_location\": [{\"y\": 2259, \"x\": 1363}, {\"y\": 2254, \"x\": 1469}, {\"y\": 2250, \"x\": 1577}, {\"y\": 2247, \"x\": 1685}, {\"y\": 2243, \"x\": 1793}, {\"y\": 2238, \"x\": 1901}, {\"y\": 2234, \"x\": 2009}, {\"y\": 2232, \"x\": 2115}, {\"y\": 2227, \"x\": 2223}, {\"y\": 2225, \"x\": 2288}, {\"y\": 2279, \"x\": 2290}, {\"y\": 2328, \"x\": 2292}, {\"y\": 2333, \"x\": 2184}, {\"y\": 2335, \"x\": 2076}, {\"y\": 2340, \"x\": 1968}, {\"y\": 2344, \"x\": 1860}, {\"y\": 2346, \"x\": 1755}, {\"y\": 2351, \"x\": 1647}, {\"y\": 2355, \"x\": 1539}, {\"y\": 2358, \"x\": 1431}, {\"y\": 2360, \"x\": 1365}, {\"y\": 2306, \"x\": 1363}], \"location\": {\"width\": 933, \"top\": 2225, \"left\": 1363, \"height\": 139}, \"words\": \"2650千焦(kJ)32%\"}, {\"vertexes_location\": [{\"y\": 2367, \"x\": 927}, {\"y\": 2367, \"x\": 1152}, {\"y\": 2466, \"x\": 1152}, {\"y\": 2466, \"x\": 927}], \"probability\": {\"variance\": 0.0, \"average\": 0.999939, \"min\": 0.999886}, \"char1s\": [{\"char1\": \"蛋\", \"location\": {\"width\": 94, \"top\": 2367, \"left\": 927, \"height\": 103}}, {\"char1\": \"白\", \"location\": {\"width\": 60, \"top\": 2367, \"left\": 1019, \"height\": 103}}, {\"char1\": \"质\", \"location\": {\"width\": 60, \"top\": 2367, \"left\": 1080, \"height\": 103}}], \"min_finegrained_vertexes_location\": [{\"y\": 2367, \"x\": 927}, {\"y\": 2367, \"x\": 1152}, {\"y\": 2466, \"x\": 1152}, {\"y\": 2466, \"x\": 927}], \"finegrained_vertexes_location\": [{\"y\": 2367, \"x\": 927}, {\"y\": 2367, \"x\": 1028}, {\"y\": 2367, \"x\": 1131}, {\"y\": 2367, \"x\": 1152}, {\"y\": 2418, \"x\": 1152}, {\"y\": 2466, \"x\": 1152}, {\"y\": 2466, \"x\": 1050}, {\"y\": 2466, \"x\": 947}, {\"y\": 2466, \"x\": 927}, {\"y\": 2414, \"x\": 927}], \"location\": {\"width\": 229, \"top\": 2367, \"left\": 927, \"height\": 103}, \"words\": \"蛋白质\"}, {\"vertexes_location\": [{\"y\": 2328, \"x\": 1496}, {\"y\": 2328, \"x\": 2290}, {\"y\": 2441, \"x\": 2290}, {\"y\": 2441, \"x\": 1496}], \"probability\": {\"variance\": 7.4e-05, \"average\": 0.995411, \"min\": 0.969308}, \"char1s\": [{\"char1\": \"2\", \"location\": {\"width\": 56, \"top\": 2328, \"left\": 1496, \"height\": 117}}, {\"char1\": \"5\", \"location\": {\"width\": 56, \"top\": 2328, \"left\": 1554, \"height\": 117}}, {\"char1\": \".\", \"location\": {\"width\": 56, \"top\": 2328, \"left\": 1588, \"height\": 117}}, {\"char1\": \"7\", \"location\": {\"width\": 56, \"top\": 2328, \"left\": 1624, \"height\": 117}}, {\"char1\": \"克\", \"location\": {\"width\": 69, \"top\": 2328, \"left\": 1669, \"height\": 117}}, {\"char1\": \"(\", \"location\": {\"width\": 58, \"top\": 2328, \"left\": 1764, \"height\": 117}}, {\"char1\": \"g\", \"location\": {\"width\": 58, \"top\": 2328, \"left\": 1797, \"height\": 117}}, {\"char1\": \")\", \"location\": {\"width\": 58, \"top\": 2328, \"left\": 1867, \"height\": 117}}, {\"char1\": \"4\", \"location\": {\"width\": 58, \"top\": 2328, \"left\": 2115, \"height\": 117}}, {\"char1\": \"3\", \"location\": {\"width\": 58, \"top\": 2328, \"left\": 2151, \"height\": 117}}, {\"char1\": \"%\", \"location\": {\"width\": 56, \"top\": 2328, \"left\": 2223, \"height\": 117}}], \"min_finegrained_vertexes_location\": [{\"y\": 2328, \"x\": 1496}, {\"y\": 2328, \"x\": 2290}, {\"y\": 2441, \"x\": 2290}, {\"y\": 2441, \"x\": 1496}], \"finegrained_vertexes_location\": [{\"y\": 2328, \"x\": 1496}, {\"y\": 2328, \"x\": 1611}, {\"y\": 2328, \"x\": 1728}, {\"y\": 2328, \"x\": 1845}, {\"y\": 2328, \"x\": 1959}, {\"y\": 2328, \"x\": 2076}, {\"y\": 2328, \"x\": 2193}, {\"y\": 2328, \"x\": 2290}, {\"y\": 2387, \"x\": 2290}, {\"y\": 2441, \"x\": 2290}, {\"y\": 2441, \"x\": 2173}, {\"y\": 2441, \"x\": 2056}, {\"y\": 2441, \"x\": 1941}, {\"y\": 2441, \"x\": 1824}, {\"y\": 2441, \"x\": 1707}, {\"y\": 2441, \"x\": 1593}, {\"y\": 2441, \"x\": 1496}, {\"y\": 2382, \"x\": 1496}], \"location\": {\"width\": 798, \"top\": 2328, \"left\": 1496, \"height\": 117}, \"words\": \"25.7克(g)43%\"}, {\"vertexes_location\": [{\"y\": 2466, \"x\": 927}, {\"y\": 2466, \"x\": 1080}, {\"y\": 2558, \"x\": 1080}, {\"y\": 2558, \"x\": 927}], \"probability\": {\"variance\": 0.0, \"average\": 0.999989, \"min\": 0.999984}, \"char1s\": [{\"char1\": \"脂\", \"location\": {\"width\": 58, \"top\": 2466, \"left\": 927, \"height\": 96}}, {\"char1\": \"肪\", \"location\": {\"width\": 58, \"top\": 2466, \"left\": 1012, \"height\": 96}}], \"min_finegrained_vertexes_location\": [{\"y\": 2463, \"x\": 927}, {\"y\": 2463, \"x\": 1080}, {\"y\": 2556, \"x\": 1080}, {\"y\": 2556, \"x\": 927}], \"finegrained_vertexes_location\": [{\"y\": 2466, \"x\": 927}, {\"y\": 2466, \"x\": 1023}, {\"y\": 2466, \"x\": 1080}, {\"y\": 2515, \"x\": 1080}, {\"y\": 2558, \"x\": 1080}, {\"y\": 2558, \"x\": 985}, {\"y\": 2558, \"x\": 927}, {\"y\": 2511, \"x\": 927}], \"location\": {\"width\": 157, \"top\": 2466, \"left\": 927, \"height\": 96}, \"words\": \"脂肪\"}, {\"vertexes_location\": [{\"y\": 2436, \"x\": 1500}, {\"y\": 2436, \"x\": 1932}, {\"y\": 2533, \"x\": 1932}, {\"y\": 2533, \"x\": 1500}], \"probability\": {\"variance\": 0.001476, \"average\": 0.984548, \"min\": 0.882917}, \"char1s\": [{\"char1\": \"5\", \"location\": {\"width\": 51, \"top\": 2436, \"left\": 1500, \"height\": 101}}, {\"char1\": \"2\", \"location\": {\"width\": 51, \"top\": 2436, \"left\": 1552, \"height\": 101}}, {\"char1\": \".\", \"location\": {\"width\": 51, \"top\": 2436, \"left\": 1581, \"height\": 101}}, {\"char1\": \"5\", \"location\": {\"width\": 51, \"top\": 2436, \"left\": 1613, \"height\": 101}}, {\"char1\": \"克\", \"location\": {\"width\": 63, \"top\": 2436, \"left\": 1685, \"height\": 101}}, {\"char1\": \"(\", \"location\": {\"width\": 51, \"top\": 2436, \"left\": 1766, \"height\": 101}}, {\"char1\": \"g\", \"location\": {\"width\": 51, \"top\": 2436, \"left\": 1797, \"height\": 101}}, {\"char1\": \")\", \"location\": {\"width\": 49, \"top\": 2436, \"left\": 1860, \"height\": 101}}], \"min_finegrained_vertexes_location\": [{\"y\": 2436, \"x\": 1500}, {\"y\": 2436, \"x\": 1932}, {\"y\": 2533, \"x\": 1932}, {\"y\": 2533, \"x\": 1500}], \"finegrained_vertexes_location\": [{\"y\": 2436, \"x\": 1500}, {\"y\": 2436, \"x\": 1604}, {\"y\": 2436, \"x\": 1705}, {\"y\": 2436, \"x\": 1806}, {\"y\": 2436, \"x\": 1908}, {\"y\": 2436, \"x\": 1932}, {\"y\": 2486, \"x\": 1932}, {\"y\": 2533, \"x\": 1932}, {\"y\": 2533, \"x\": 1829}, {\"y\": 2533, \"x\": 1728}, {\"y\": 2533, \"x\": 1626}, {\"y\": 2533, \"x\": 1525}, {\"y\": 2533, \"x\": 1500}, {\"y\": 2484, \"x\": 1500}], \"location\": {\"width\": 436, \"top\": 2436, \"left\": 1500, \"height\": 101}, \"words\": \"52.5克(g)\"}, {\"vertexes_location\": [{\"y\": 2418, \"x\": 2128}, {\"y\": 2418, \"x\": 2288}, {\"y\": 2497, \"x\": 2288}, {\"y\": 2497, \"x\": 2128}], \"probability\": {\"variance\": 0.000229, \"average\": 0.988781, \"min\": 0.96739}, \"char1s\": [{\"char1\": \"8\", \"location\": {\"width\": 40, \"top\": 2418, \"left\": 2128, \"height\": 83}}, {\"char1\": \"8\", \"location\": {\"width\": 49, \"top\": 2418, \"left\": 2178, \"height\": 83}}, {\"char1\": \"%\", \"location\": {\"width\": 42, \"top\": 2418, \"left\": 2218, \"height\": 83}}], \"min_finegrained_vertexes_location\": [{\"y\": 2418, \"x\": 2128}, {\"y\": 2418, \"x\": 2288}, {\"y\": 2497, \"x\": 2288}, {\"y\": 2497, \"x\": 2128}], \"finegrained_vertexes_location\": [{\"y\": 2418, \"x\": 2128}, {\"y\": 2418, \"x\": 2211}, {\"y\": 2418, \"x\": 2288}, {\"y\": 2461, \"x\": 2288}, {\"y\": 2497, \"x\": 2288}, {\"y\": 2497, \"x\": 2205}, {\"y\": 2497, \"x\": 2128}, {\"y\": 2457, \"x\": 2128}], \"location\": {\"width\": 164, \"top\": 2418, \"left\": 2128, \"height\": 83}, \"words\": \"88%\"}, {\"vertexes_location\": [{\"y\": 2549, \"x\": 929}, {\"y\": 2549, \"x\": 1298}, {\"y\": 2650, \"x\": 1298}, {\"y\": 2650, \"x\": 929}], \"probability\": {\"variance\": 0.0, \"average\": 0.999678, \"min\": 0.998787}, \"char1s\": [{\"char1\": \"碳\", \"location\": {\"width\": 63, \"top\": 2549, \"left\": 929, \"height\": 105}}, {\"char1\": \"水\", \"location\": {\"width\": 63, \"top\": 2549, \"left\": 1021, \"height\": 105}}, {\"char1\": \"化\", \"location\": {\"width\": 63, \"top\": 2549, \"left\": 1084, \"height\": 105}}, {\"char1\": \"合\", \"location\": {\"width\": 63, \"top\": 2549, \"left\": 1147, \"height\": 105}}, {\"char1\": \"物\", \"location\": {\"width\": 63, \"top\": 2549, \"left\": 1210, \"height\": 105}}], \"min_finegrained_vertexes_location\": [{\"y\": 2547, \"x\": 929}, {\"y\": 2547, \"x\": 1298}, {\"y\": 2648, \"x\": 1298}, {\"y\": 2648, \"x\": 929}], \"finegrained_vertexes_location\": [{\"y\": 2549, \"x\": 929}, {\"y\": 2549, \"x\": 1032}, {\"y\": 2549, \"x\": 1136}, {\"y\": 2549, \"x\": 1239}, {\"y\": 2549, \"x\": 1298}, {\"y\": 2601, \"x\": 1298}, {\"y\": 2650, \"x\": 1298}, {\"y\": 2650, \"x\": 1192}, {\"y\": 2650, \"x\": 1089}, {\"y\": 2650, \"x\": 985}, {\"y\": 2650, \"x\": 929}, {\"y\": 2596, \"x\": 929}], \"location\": {\"width\": 371, \"top\": 2549, \"left\": 929, \"height\": 105}, \"words\": \"碳水化合物\"}, {\"vertexes_location\": [{\"y\": 2529, \"x\": 1505}, {\"y\": 2529, \"x\": 1932}, {\"y\": 2628, \"x\": 1932}, {\"y\": 2628, \"x\": 1505}], \"probability\": {\"variance\": 0.000178, \"average\": 0.993371, \"min\": 0.958698}, \"char1s\": [{\"char1\": \"1\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1505, \"height\": 103}}, {\"char1\": \"5\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1557, \"height\": 103}}, {\"char1\": \".\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1586, \"height\": 103}}, {\"char1\": \"9\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1617, \"height\": 103}}, {\"char1\": \"克\", \"location\": {\"width\": 60, \"top\": 2529, \"left\": 1692, \"height\": 103}}, {\"char1\": \"(\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1743, \"height\": 103}}, {\"char1\": \"g\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1804, \"height\": 103}}, {\"char1\": \")\", \"location\": {\"width\": 51, \"top\": 2529, \"left\": 1867, \"height\": 103}}], \"min_finegrained_vertexes_location\": [{\"y\": 2529, \"x\": 1505}, {\"y\": 2529, \"x\": 1932}, {\"y\": 2628, \"x\": 1932}, {\"y\": 2628, \"x\": 1505}], \"finegrained_vertexes_location\": [{\"y\": 2529, \"x\": 1505}, {\"y\": 2529, \"x\": 1608}, {\"y\": 2529, \"x\": 1710}, {\"y\": 2529, \"x\": 1813}, {\"y\": 2529, \"x\": 1917}, {\"y\": 2529, \"x\": 1932}, {\"y\": 2580, \"x\": 1932}, {\"y\": 2628, \"x\": 1932}, {\"y\": 2628, \"x\": 1829}, {\"y\": 2628, \"x\": 1725}, {\"y\": 2628, \"x\": 1622}, {\"y\": 2628, \"x\": 1518}, {\"y\": 2628, \"x\": 1505}, {\"y\": 2576, \"x\": 1505}], \"location\": {\"width\": 432, \"top\": 2529, \"left\": 1505, \"height\": 103}, \"words\": \"15.9克(g)\"}, {\"vertexes_location\": [{\"y\": 2508, \"x\": 2157}, {\"y\": 2508, \"x\": 2288}, {\"y\": 2596, \"x\": 2288}, {\"y\": 2596, \"x\": 2157}], \"probability\": {\"variance\": 0.0, \"average\": 0.999792, \"min\": 0.999764}, \"char1s\": [{\"char1\": \"5\", \"location\": {\"width\": 45, \"top\": 2508, \"left\": 2175, \"height\": 90}}, {\"char1\": \"%\", \"location\": {\"width\": 47, \"top\": 2508, \"left\": 2202, \"height\": 90}}], \"min_finegrained_vertexes_location\": [{\"y\": 2508, \"x\": 2157}, {\"y\": 2508, \"x\": 2288}, {\"y\": 2596, \"x\": 2288}, {\"y\": 2596, \"x\": 2157}], \"finegrained_vertexes_location\": [{\"y\": 2508, \"x\": 2157}, {\"y\": 2508, \"x\": 2250}, {\"y\": 2508, \"x\": 2288}, {\"y\": 2553, \"x\": 2288}, {\"y\": 2596, \"x\": 2288}, {\"y\": 2596, \"x\": 2198}, {\"y\": 2596, \"x\": 2157}, {\"y\": 2549, \"x\": 2157}], \"location\": {\"width\": 135, \"top\": 2508, \"left\": 2157, \"height\": 90}, \"words\": \"5%\"}, {\"vertexes_location\": [{\"y\": 2621, \"x\": 1417}, {\"y\": 2621, \"x\": 1937}, {\"y\": 2727, \"x\": 1937}, {\"y\": 2727, \"x\": 1417}], \"probability\": {\"variance\": 2e-06, \"average\": 0.998791, \"min\": 0.996525}, \"char1s\": [{\"char1\": \"2\", \"location\": {\"width\": 54, \"top\": 2621, \"left\": 1417, \"height\": 110}}, {\"char1\": \"3\", \"location\": {\"width\": 56, \"top\": 2621, \"left\": 1471, \"height\": 110}}, {\"char1\": \"毫\", \"location\": {\"width\": 67, \"top\": 2621, \"left\": 1516, \"height\": 110}}, {\"char1\": \"克\", \"location\": {\"width\": 67, \"top\": 2621, \"left\": 1617, \"height\": 110}}, {\"char1\": \"(\", \"location\": {\"width\": 56, \"top\": 2621, \"left\": 1674, \"height\": 110}}, {\"char1\": \"m\", \"location\": {\"width\": 56, \"top\": 2621, \"left\": 1741, \"height\": 110}}, {\"char1\": \"g\", \"location\": {\"width\": 56, \"top\": 2621, \"left\": 1809, \"height\": 110}}, {\"char1\": \")\", \"location\": {\"width\": 56, \"top\": 2621, \"left\": 1876, \"height\": 110}}], \"min_finegrained_vertexes_location\": [{\"y\": 2619, \"x\": 1415}, {\"y\": 2619, \"x\": 1935}, {\"y\": 2724, \"x\": 1935}, {\"y\": 2724, \"x\": 1415}], \"finegrained_vertexes_location\": [{\"y\": 2621, \"x\": 1417}, {\"y\": 2621, \"x\": 1527}, {\"y\": 2621, \"x\": 1640}, {\"y\": 2621, \"x\": 1750}, {\"y\": 2621, \"x\": 1863}, {\"y\": 2621, \"x\": 1937}, {\"y\": 2677, \"x\": 1937}, {\"y\": 2727, \"x\": 1937}, {\"y\": 2727, \"x\": 1824}, {\"y\": 2727, \"x\": 1714}, {\"y\": 2727, \"x\": 1602}, {\"y\": 2727, \"x\": 1491}, {\"y\": 2727, \"x\": 1417}, {\"y\": 2670, \"x\": 1417}], \"location\": {\"width\": 524, \"top\": 2621, \"left\": 1417, \"height\": 110}, \"words\": \"23毫克(mg)\"}, {\"vertexes_location\": [{\"y\": 2596, \"x\": 2157}, {\"y\": 2596, \"x\": 2283}, {\"y\": 2682, \"x\": 2283}, {\"y\": 2682, \"x\": 2157}], \"probability\": {\"variance\": 0.0, \"average\": 0.999226, \"min\": 0.998817}, \"char1s\": [{\"char1\": \"1\", \"location\": {\"width\": 45, \"top\": 2596, \"left\": 2173, \"height\": 87}}, {\"char1\": \"%\", \"location\": {\"width\": 45, \"top\": 2596, \"left\": 2200, \"height\": 87}}], \"min_finegrained_vertexes_location\": [{\"y\": 2596, \"x\": 2157}, {\"y\": 2596, \"x\": 2283}, {\"y\": 2682, \"x\": 2283}, {\"y\": 2682, \"x\": 2157}], \"finegrained_vertexes_location\": [{\"y\": 2596, \"x\": 2157}, {\"y\": 2596, \"x\": 2245}, {\"y\": 2596, \"x\": 2283}, {\"y\": 2641, \"x\": 2283}, {\"y\": 2682, \"x\": 2283}, {\"y\": 2682, \"x\": 2196}, {\"y\": 2682, \"x\": 2157}, {\"y\": 2637, \"x\": 2157}], \"location\": {\"width\": 128, \"top\": 2596, \"left\": 2157, \"height\": 87}, \"words\": \"1%\"}, {\"vertexes_location\": [{\"y\": 2655, \"x\": 929}, {\"y\": 2655, \"x\": 1023}, {\"y\": 2745, \"x\": 1023}, {\"y\": 2745, \"x\": 929}], \"probability\": {\"variance\": 0.0, \"average\": 0.999972, \"min\": 0.999972}, \"char1s\": [{\"char1\": \"钠\", \"location\": {\"width\": 58, \"top\": 2655, \"left\": 929, \"height\": 94}}], \"min_finegrained_vertexes_location\": [{\"y\": 2655, \"x\": 929}, {\"y\": 2655, \"x\": 1023}, {\"y\": 2745, \"x\": 1023}, {\"y\": 2745, \"x\": 929}], \"finegrained_vertexes_location\": [{\"y\": 2655, \"x\": 929}, {\"y\": 2655, \"x\": 1023}, {\"y\": 2702, \"x\": 1023}, {\"y\": 2745, \"x\": 1023}, {\"y\": 2745, \"x\": 929}, {\"y\": 2697, \"x\": 929}], \"location\": {\"width\": 99, \"top\": 2655, \"left\": 929, \"height\": 94}, \"words\": \"钠\"}, {\"vertexes_location\": [{\"y\": 2846, \"x\": 821}, {\"y\": 2742, \"x\": 2385}, {\"y\": 2859, \"x\": 2409}, {\"y\": 2965, \"x\": 819}], \"probability\": {\"variance\": 3e-06, \"average\": 0.999129, \"min\": 0.992866}, \"char1s\": [{\"char1\": \"温\", \"location\": {\"width\": 76, \"top\": 2846, \"left\": 819, \"height\": 126}}, {\"char1\": \"馨\", \"location\": {\"width\": 78, \"top\": 2848, \"left\": 893, \"height\": 128}}, {\"char1\": \"提\", \"location\": {\"width\": 74, \"top\": 2850, \"left\": 972, \"height\": 126}}, {\"char1\": \"示\", \"location\": {\"width\": 92, \"top\": 2850, \"left\": 1073, \"height\": 130}}, {\"char1\": \":\", \"location\": {\"width\": 76, \"top\": 2857, \"left\": 1145, \"height\": 126}}, {\"char1\": \"内\", \"location\": {\"width\": 76, \"top\": 2846, \"left\": 1233, \"height\": 132}}, {\"char1\": \"含\", \"location\": {\"width\": 119, \"top\": 2844, \"left\": 1309, \"height\": 126}}, {\"char1\": \"有\", \"location\": {\"width\": 81, \"top\": 2844, \"left\": 1422, \"height\": 126}}, {\"char1\": \"脱\", \"location\": {\"width\": 81, \"top\": 2839, \"left\": 1496, \"height\": 128}}, {\"char1\": \"氧\", \"location\": {\"width\": 81, \"top\": 2832, \"left\": 1611, \"height\": 128}}, {\"char1\": \"剂\", \"location\": {\"width\": 83, \"top\": 2828, \"left\": 1685, \"height\": 128}}, {\"char1\": \"请\", \"location\": {\"width\": 85, \"top\": 2823, \"left\": 1759, \"height\": 128}}, {\"char1\": \"勿\", \"location\": {\"width\": 85, \"top\": 2814, \"left\": 1874, \"height\": 128}}, {\"char1\": \"食\", \"location\": {\"width\": 90, \"top\": 2808, \"left\": 1948, \"height\": 130}}, {\"char1\": \"用\", \"location\": {\"width\": 94, \"top\": 2799, \"left\": 2022, \"height\": 130}}, {\"char1\": \",\", \"location\": {\"width\": 83, \"top\": 2792, \"left\": 2085, \"height\": 130}}, {\"char1\": \"幼\", \"location\": {\"width\": 99, \"top\": 2774, \"left\": 2173, \"height\": 135}}, {\"char1\": \"童\", \"location\": {\"width\": 65, \"top\": 2765, \"left\": 2245, \"height\": 130}}, {\"char1\": \"应\", \"location\": {\"width\": 99, \"top\": 2749, \"left\": 2283, \"height\": 137}}], \"min_finegrained_vertexes_location\": [{\"y\": 2846, \"x\": 810}, {\"y\": 2740, \"x\": 2400}, {\"y\": 2904, \"x\": 2412}, {\"y\": 3010, \"x\": 821}], \"finegrained_vertexes_location\": [{\"y\": 2846, \"x\": 821}, {\"y\": 2850, \"x\": 945}, {\"y\": 2850, \"x\": 1071}, {\"y\": 2859, \"x\": 1194}, {\"y\": 2846, \"x\": 1318}, {\"y\": 2846, \"x\": 1442}, {\"y\": 2839, \"x\": 1566}, {\"y\": 2832, \"x\": 1689}, {\"y\": 2826, \"x\": 1813}, {\"y\": 2814, \"x\": 1939}, {\"y\": 2801, \"x\": 2061}, {\"y\": 2785, \"x\": 2184}, {\"y\": 2760, \"x\": 2306}, {\"y\": 2742, \"x\": 2385}, {\"y\": 2803, \"x\": 2398}, {\"y\": 2859, \"x\": 2409}, {\"y\": 2886, \"x\": 2288}, {\"y\": 2909, \"x\": 2164}, {\"y\": 2925, \"x\": 2034}, {\"y\": 2936, \"x\": 1903}, {\"y\": 2947, \"x\": 1779}, {\"y\": 2954, \"x\": 1653}, {\"y\": 2961, \"x\": 1527}, {\"y\": 2963, \"x\": 1399}, {\"y\": 2967, \"x\": 1280}, {\"y\": 2976, \"x\": 1154}, {\"y\": 2972, \"x\": 1026}, {\"y\": 2967, \"x\": 897}, {\"y\": 2965, \"x\": 819}, {\"y\": 2904, \"x\": 819}], \"location\": {\"width\": 1597, \"top\": 2742, \"left\": 819, \"height\": 240}, \"words\": \"温馨提示:内含有脱氧剂请勿食用,幼童应\"}, {\"vertexes_location\": [{\"y\": 2958, \"x\": 821}, {\"y\": 2958, \"x\": 1644}, {\"y\": 3075, \"x\": 1644}, {\"y\": 3075, \"x\": 821}], \"probability\": {\"variance\": 2.5e-05, \"average\": 0.997801, \"min\": 0.982993}, \"char1s\": [{\"char1\": \"在\", \"location\": {\"width\": 74, \"top\": 2958, \"left\": 821, \"height\": 121}}, {\"char1\": \"监\", \"location\": {\"width\": 40, \"top\": 2958, \"left\": 931, \"height\": 121}}, {\"char1\": \"护\", \"location\": {\"width\": 72, \"top\": 2958, \"left\": 969, \"height\": 121}}, {\"char1\": \"人\", \"location\": {\"width\": 74, \"top\": 2958, \"left\": 1077, \"height\": 121}}, {\"char1\": \"指\", \"location\": {\"width\": 72, \"top\": 2958, \"left\": 1152, \"height\": 121}}, {\"char1\": \"导\", \"location\": {\"width\": 72, \"top\": 2958, \"left\": 1226, \"height\": 121}}, {\"char1\": \"下\", \"location\": {\"width\": 74, \"top\": 2958, \"left\": 1336, \"height\": 121}}, {\"char1\": \"食\", \"location\": {\"width\": 74, \"top\": 2958, \"left\": 1410, \"height\": 121}}, {\"char1\": \"用\", \"location\": {\"width\": 72, \"top\": 2958, \"left\": 1523, \"height\": 121}}, {\"char1\": \"。\", \"location\": {\"width\": 60, \"top\": 2958, \"left\": 1584, \"height\": 121}}], \"min_finegrained_vertexes_location\": [{\"y\": 2958, \"x\": 821}, {\"y\": 2958, \"x\": 1644}, {\"y\": 3075, \"x\": 1644}, {\"y\": 3075, \"x\": 821}], \"finegrained_vertexes_location\": [{\"y\": 2958, \"x\": 821}, {\"y\": 2958, \"x\": 942}, {\"y\": 2958, \"x\": 1066}, {\"y\": 2958, \"x\": 1188}, {\"y\": 2958, \"x\": 1309}, {\"y\": 2958, \"x\": 1431}, {\"y\": 2958, \"x\": 1552}, {\"y\": 2958, \"x\": 1644}, {\"y\": 3019, \"x\": 1644}, {\"y\": 3075, \"x\": 1644}, {\"y\": 3075, \"x\": 1523}, {\"y\": 3075, \"x\": 1399}, {\"y\": 3075, \"x\": 1278}, {\"y\": 3075, \"x\": 1156}, {\"y\": 3075, \"x\": 1035}, {\"y\": 3075, \"x\": 913}, {\"y\": 3075, \"x\": 821}, {\"y\": 3015, \"x\": 821}], \"location\": {\"width\": 828, \"top\": 2958, \"left\": 821, \"height\": 121}, \"words\": \"在监护人指导下食用。\"}, {\"vertexes_location\": [{\"y\": 3156, \"x\": 823}, {\"y\": 3156, \"x\": 1554}, {\"y\": 3307, \"x\": 1554}, {\"y\": 3307, \"x\": 823}], \"probability\": {\"variance\": 0.0, \"average\": 0.999761, \"min\": 0.998522}, \"char1s\": [{\"char1\": \"净\", \"location\": {\"width\": 96, \"top\": 3156, \"left\": 823, \"height\": 157}}, {\"char1\": \"含\", \"location\": {\"width\": 96, \"top\": 3156, \"left\": 918, \"height\": 157}}, {\"char1\": \"量\", \"location\": {\"width\": 94, \"top\": 3156, \"left\": 1012, \"height\": 157}}, {\"char1\": \":\", \"location\": {\"width\": 76, \"top\": 3156, \"left\": 1138, \"height\": 157}}, {\"char1\": \"1\", \"location\": {\"width\": 76, \"top\": 3156, \"left\": 1188, \"height\": 157}}, {\"char1\": \"5\", \"location\": {\"width\": 76, \"top\": 3156, \"left\": 1282, \"height\": 157}}, {\"char1\": \"8\", \"location\": {\"width\": 78, \"top\": 3156, \"left\": 1377, \"height\": 157}}, {\"char1\": \"克\", \"location\": {\"width\": 94, \"top\": 3156, \"left\": 1442, \"height\": 157}}], \"min_finegrained_vertexes_location\": [{\"y\": 3156, \"x\": 823}, {\"y\": 3156, \"x\": 1554}, {\"y\": 3307, \"x\": 1554}, {\"y\": 3307, \"x\": 823}], \"finegrained_vertexes_location\": [{\"y\": 3156, \"x\": 823}, {\"y\": 3156, \"x\": 981}, {\"y\": 3156, \"x\": 1138}, {\"y\": 3156, \"x\": 1296}, {\"y\": 3156, \"x\": 1453}, {\"y\": 3156, \"x\": 1554}, {\"y\": 3235, \"x\": 1554}, {\"y\": 3307, \"x\": 1554}, {\"y\": 3307, \"x\": 1397}, {\"y\": 3307, \"x\": 1239}, {\"y\": 3307, \"x\": 1082}, {\"y\": 3307, \"x\": 924}, {\"y\": 3307, \"x\": 823}, {\"y\": 3228, \"x\": 823}], \"location\": {\"width\": 735, \"top\": 3156, \"left\": 823, \"height\": 157}, \"words\": \"净含量:158克\"}, {\"vertexes_location\": [{\"y\": 3890, \"x\": 954}, {\"y\": 3654, \"x\": 2009}, {\"y\": 3782, \"x\": 2061}, {\"y\": 4023, \"x\": 985}], \"probability\": {\"variance\": 0.003403, \"average\": 0.971479, \"min\": 0.776126}, \"char1s\": [{\"char1\": \"6\", \"location\": {\"width\": 110, \"top\": 3856, \"left\": 985, \"height\": 139}}, {\"char1\": \"9\", \"location\": {\"width\": 141, \"top\": 3863, \"left\": 1044, \"height\": 166}}, {\"char1\": \"7\", \"location\": {\"width\": 74, \"top\": 3876, \"left\": 1145, \"height\": 153}}, {\"char1\": \"0\", \"location\": {\"width\": 81, \"top\": 3876, \"left\": 1188, \"height\": 146}}, {\"char1\": \"9\", \"location\": {\"width\": 81, \"top\": 3876, \"left\": 1280, \"height\": 146}}, {\"char1\": \"5\", \"location\": {\"width\": 96, \"top\": 3874, \"left\": 1323, \"height\": 146}}, {\"char1\": \"2\", \"location\": {\"width\": 112, \"top\": 3867, \"left\": 1368, \"height\": 150}}, {\"char1\": \"2\", \"location\": {\"width\": 112, \"top\": 3843, \"left\": 1453, \"height\": 157}}, {\"char1\": \"8\", \"location\": {\"width\": 121, \"top\": 3816, \"left\": 1536, \"height\": 157}}, {\"char1\": \"0\", \"location\": {\"width\": 121, \"top\": 3800, \"left\": 1579, \"height\": 159}}, {\"char1\": \"5\", \"location\": {\"width\": 117, \"top\": 3784, \"left\": 1620, \"height\": 159}}, {\"char1\": \"4\", \"location\": {\"width\": 117, \"top\": 3768, \"left\": 1662, \"height\": 159}}, {\"char1\": \"3\", \"location\": {\"width\": 121, \"top\": 3753, \"left\": 1701, \"height\": 159}}], \"min_finegrained_vertexes_location\": [{\"y\": 3890, \"x\": 951}, {\"y\": 3647, \"x\": 2029}, {\"y\": 3863, \"x\": 2079}, {\"y\": 4106, \"x\": 999}], \"finegrained_vertexes_location\": [{\"y\": 3890, \"x\": 954}, {\"y\": 3858, \"x\": 1095}, {\"y\": 3879, \"x\": 1235}, {\"y\": 3874, \"x\": 1379}, {\"y\": 3843, \"x\": 1521}, {\"y\": 3795, \"x\": 1656}, {\"y\": 3744, \"x\": 1793}, {\"y\": 3687, \"x\": 1926}, {\"y\": 3654, \"x\": 2009}, {\"y\": 3721, \"x\": 2036}, {\"y\": 3782, \"x\": 2061}, {\"y\": 3836, \"x\": 1928}, {\"y\": 3892, \"x\": 1793}, {\"y\": 3944, \"x\": 1658}, {\"y\": 3991, \"x\": 1514}, {\"y\": 4016, \"x\": 1332}, {\"y\": 4018, \"x\": 1183}, {\"y\": 3984, \"x\": 985}, {\"y\": 4023, \"x\": 985}, {\"y\": 3951, \"x\": 965}], \"location\": {\"width\": 1113, \"top\": 3654, \"left\": 954, \"height\": 375}, \"words\": \"6970952280543\"}, {\"vertexes_location\": [{\"y\": 4268, \"x\": 3080}, {\"y\": 4268, \"x\": 3249}, {\"y\": 4405, \"x\": 3249}, {\"y\": 4405, \"x\": 3080}], \"probability\": {\"variance\": 0.0, \"average\": 0.962675, \"min\": 0.962675}, \"char1s\": [{\"char1\": \"T\", \"location\": {\"width\": 49, \"top\": 4275, \"left\": 3091, \"height\": 130}}, {\"char1\": \"a\", \"location\": {\"width\": 60, \"top\": 4275, \"left\": 3125, \"height\": 130}}, {\"char1\": \"b\", \"location\": {\"width\": 72, \"top\": 4275, \"left\": 3170, \"height\": 130}}], \"min_finegrained_vertexes_location\": [{\"y\": 4268, \"x\": 3078}, {\"y\": 4268, \"x\": 3246}, {\"y\": 4405, \"x\": 3246}, {\"y\": 4405, \"x\": 3078}], \"finegrained_vertexes_location\": [{\"y\": 4268, \"x\": 3080}, {\"y\": 4268, \"x\": 3210}, {\"y\": 4268, \"x\": 3249}, {\"y\": 4333, \"x\": 3249}, {\"y\": 4398, \"x\": 3249}, {\"y\": 4405, \"x\": 3249}, {\"y\": 4405, \"x\": 3118}, {\"y\": 4405, \"x\": 3080}, {\"y\": 4340, \"x\": 3080}, {\"y\": 4275, \"x\": 3080}], \"location\": {\"width\": 173, \"top\": 4268, \"left\": 3080, \"height\": 141}, \"words\": \" Tab\"}]}\n", Ocr_Bean.class);
      //   Ocr_Bean bean = General.getMessage("C:\\Users\\Administrator\\Documents\\CoCall4\\16212@test\\recvfile\\杨澜\\dddd\\1717.jpg");
            ceShi(bean);

//        String folderPath = "C:\\Users\\Administrator\\Documents\\CoCall4\\16212@test\\recvfile\\杨澜\\dddd";
//        File file = new File(folderPath);
//        File [] files = file.listFiles();
//        BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\ceShi.txt"));
//
//        for (int i = 0; i < files.length; i++) {
//            Ocr_Bean bean = General.getMessage(files [i].getAbsolutePath());
//            if (General.getmessage(bean).contains("营养成分表")) {
//                bufferedWriter.write(files[i].getName());
//                ceShi(bean,bufferedWriter);
//                bufferedWriter.flush();
//            }
//        }
//
//        bufferedWriter.close();
    }
    public static void ceShi (Ocr_Bean bean) {
   // public static void ceShi (Ocr_Bean bean,BufferedWriter bufferedWriter)throws IOException {
        System.out.println("未优化后的结果：" + General.getmessage(bean));

        /**
         *     位置信息locationList
         *     结果储存每个点的x:left y :top high :height width:width
         */
        List<Ocr_Chars_Location> locationList = new ArrayList<>();
        /**
         *     字符信息charList
         *     储存与位置信息对应的字符内容
         */
        List<String> charList = new ArrayList<>();



        /**
         *     顶点信息heightList
         *     储存与位置信息对应的height内容
         */
        List<Integer> heightList = new ArrayList<>();

        /**
         * 每个字符的索引信息list，最后使用此list顺序决定返回结果
         */

        //填充位置list
        List<Ocr_words_result> list1  = bean.getWords_result();
        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list1.get(i).getChars().size(); j++) {
                locationList.add(list1.get(i).getChars().get(j).getLocation());
            }

        }
        //填充字符list
        for (int i = 0; i < list1.size(); i++) {
            for (int k = 0; k < list1.get(i).getChars().size(); k++) {
                charList.add(list1.get(i).getChars().get(k).getChar1());
            }
        }
        //填充高度集合
        for (int i = 0; i < locationList.size(); i++) {
            heightList.add(locationList.get(i).getHeight());
        }

        /**
         * 找出每个height的数量结果保存到map中
         */
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < heightList.size(); i++) {
            if (!map.containsKey(heightList.get(i))){
                map.put(heightList.get(i),1);
            }
            else {
                map.put(heightList.get(i),map.get(heightList.get(i)) + 1);
            }
        }
        /**
         * 找出数量最多的高度（maxCountHigh）
         */
        List<Integer> list2 = new ArrayList(map.keySet());
        int maxCountKey = 0;
        int maxValue = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (map.get(list2.get(i)) > maxValue){
                maxValue = map.get(list2.get(i));
                maxCountKey = list2.get(i);
            }
        }
        int maxCountHigh = maxCountKey;
        list2.sort(Integer::compareTo);
        /**
         * 最小高度 minHeight
         */

        int minHeight = list2.get(0);

        for (int i = 0; i < locationList.size(); i++) {
            List<Integer> iList = new ArrayList<>();

        }



        exchangeLocation(locationList, charList,maxCountHigh);

        sortByRight(locationList,charList,maxCountHigh);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charList.size(); i++) {
            stringBuilder.append(charList.get(i));
        }
        System.out.println("已优化后的结果：" + stringBuilder.toString());
        System.out.println("未优化结果：" + General.getmessage(bean));
//        bufferedWriter.write("未优化结果：" + General.getmessage(bean));
//        bufferedWriter.newLine();
//        bufferedWriter.write("以优化结果：" + stringBuilder.toString());
//        bufferedWriter.newLine();
//        bufferedWriter.newLine();
//        bufferedWriter.flush();

        System.out.println("差值list  ：" + getDifferenceList(getTopList(locationList)));
        System.out.println("差值list  ：" + getTopList(locationList));
        System.out.println("差值list  ：" + charList);

        for (int i = 0; i < charList.size(); i++) {
            if (i!=charList.size()-1) {
                System.out.print("差值list  ：" + getDifferenceList(getTopList(locationList)).get(i));
            }
            System.out.print("差值list  ：" + getTopList(locationList).get(i));
            System.out.print("差值list  ：" + charList.get(i));
            System.out.println();
        }






    }

    /**
     * 使用递归从后往前进行多次拼接直至没有差值过大的字符
     * @param locationList  位置信息集合
     * @param charList      字符集合
     * @param maxCountHigh  数量最多的高度
     */
    public static void exchangeLocation(List<Ocr_Chars_Location> locationList, List<String> charList,int maxCountHigh){
        //索引集合
        List<List<Integer>> indexList = new ArrayList<>();
        List<Integer>  topList = getTopList(locationList);

        List<Integer> differenceList ;
        List<Integer> overScopeIndexList ;

        differenceList = getDifferenceList(topList );
        overScopeIndexList = getOverScopeIndexList(topList,maxCountHigh);





        /**
         * 为索引对集合添加内容
         */
        for (int i = 0; i < overScopeIndexList.size(); i++) {
            for (int j = overScopeIndexList.get(i); j < differenceList.size(); j++) {
                if (differenceList.get(j) > maxCountHigh*0.9){
                    List<Integer> list =new ArrayList<>();
                    list.add(overScopeIndexList.get(i));
                    list.add(j);
                    int lastNode = 0;
                    for (int k = overScopeIndexList.get(i); k > 0 ; k--) {
                        if (differenceList.get(k) > maxCountHigh*0.9){
                            lastNode = k + 1;
                            break;
                        }
                    }
                    list.add(lastNode);
                    indexList.add(list);

                    break;
                }
            }
        }
//        /**
//         * 判断最后一个串行是否录入
//         */
//        if (!indexList.get(indexList.size() - 1).contains(overScopeIndexList.get(overScopeIndexList.size() - 1))){
//            List<Integer> list = new ArrayList<>();
//            list.add(overScopeIndexList.get(overScopeIndexList.size() -1));
//            list.add(differenceList.size() + 1);
//            int lastNode = 0;
//            for (int k = overScopeIndexList.get(overScopeIndexList.get(overScopeIndexList.size() -1)); k > 0 ; k--) {
//                if (differenceList.get(k) > maxCountHigh*0.9){
//                    lastNode = k + 1;
//                    break;
//                }
//            }
//            list.add(lastNode);
//            indexList.add(list);
//
//        }

        if(indexList.size() > 0 && indexList.get(indexList.size() - 1).size() ==3) {
            List<Integer> list1 = indexList.get(indexList.size() - 1);
            exchangeLocation(locationList,charList,list1.get(2),list1.get(0),list1.get(1));
            exchangeLocation(locationList, charList,maxCountHigh);



            }
    }

    /**
     * 交换位置集合和字符集合的位置
     * @param locationList      位置集合
     * @param characterList     字符集合
     * @param index             选择需要加入的位置
     * @param start             需要截取的开始索引
     * @param end               需要截取的结束索引
     */
    public static void exchangeLocation(List<Ocr_Chars_Location> locationList,List<String> characterList,int index,int start,int end){

        changeList(locationList,index,start,end);
        changeList(characterList,index,start,end);


    }

    /**
     * 得到差值集合           differenceList
     * @param topList        每个字符的顶点坐标集合
     * @return               differenceList
     */
    public static List<Integer> getDifferenceList(List<Integer> topList){
        List<Integer> differenceList = new ArrayList<>();

        for (int i = 1; i < topList.size(); i++) {
            int Difference = topList.get(i) - topList.get(i - 1);

            differenceList.add(Difference);
        }
        return differenceList;
    }

    /**
     * 得到超过范围的索引集合         overScopeIndexList
     * @param topList               每个字符的顶点坐标集合
     * @param maxCountHigh          数量最多的高度值
     * @return                      overScopeIndexList
     */
    public static List<Integer> getOverScopeIndexList(List<Integer> topList,int maxCountHigh){
        List<Integer> overScopeIndexList = new ArrayList<>();

        for (int i = 1; i < topList.size(); i++) {
            int Difference = topList.get(i) - topList.get(i - 1);
            if (Difference <= (-maxCountHigh*0.9)){
                overScopeIndexList.add(i);
            }
        }
        return overScopeIndexList;
    }

    public static void sortByRight(List<Ocr_Chars_Location> locationList,List<String> characterList,int maxCounthigh){
        List<Integer> differenceList = getDifferenceList(getTopList(locationList));
        int node = 0;
        for (int i = 0; i < differenceList.size(); i++) {
            if (differenceList.get(i) > maxCounthigh*0.8){
                if (node == i){
                    continue;
                }
                sortByRight(locationList,characterList,node,i);
                node = i + 1;
            }

        }


    }
    public static void sortByRight(List<Ocr_Chars_Location> locationList,List<String> characterList,int left,int right){
        int temp = locationList.get(left).getLeft();
        int i = left;
        int j = right;
        if (left > right){
            return;
        }
        while(i!=j){
            while(locationList.get(j).getLeft() >= temp && j > i){
                j--;
            }
            while(locationList.get(i).getLeft() <= temp && j > i){
                i--;
            }
            if (i < j){
            changeList(locationList,characterList,i,j);

            }
        }
        changeList(locationList,characterList,i,left);
        sortByRight(locationList,characterList,left,i - 1);
        sortByRight(locationList,characterList,i +1,right);
        
    }
    /**
     * 得到每个字符的顶点坐标集合
     * @param locationList  位置信息集合
     * @return  topList 每个字符的顶点坐标集合
     */
    public static List<Integer> getTopList(List<Ocr_Chars_Location> locationList){
        List<Integer> topList = new ArrayList<>();

        for (int i = 0; i < locationList.size(); i++) {
            topList.add(locationList.get(i).getTop());
        }
        return topList;
    }
    /**
     * 交换list位置集合和字符集合的位置
     * @param list              字符集合
     * @param index             选择需要加入的位置
     * @param start             需要截取的开始索引
     * @param end               需要截取的结束索引
     */
    public static void changeList(List list,int index,int start,int end){

        List list1 = new ArrayList(list.subList(start,end+1));
        int len =list1.size();
        for (int i = 0; i < len; i++) {
            list.remove(start);
        }
        list.addAll(index,list1);
    }

    /**
     * 更改位置和字符信息
     * @param locationList          位置集合
     * @param characterList         字符集合
     * @param index1                需要交换的索引
     * @param index2                需要交换的索引
     */
    public static void changeList(List<Ocr_Chars_Location> locationList,List<String> characterList,int index1,int index2){
        Collections.swap(locationList,index1,index2);
        Collections.swap(characterList,index1,index2);
    }

}
