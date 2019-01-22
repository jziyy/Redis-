package com.ocr.test;

import com.ocr.ocrbeans.bd.beans.Ocr_Bean;
import com.ocr.ocrbeans.bd.beans.Ocr_Chars_Location;
import com.ocr.ocrbeans.bd.beans.Ocr_words_result;
import com.ocr.utils.alutil.General;

import java.io.IOException;
import java.util.*;

public class BeanStringOptimize {
    public static void main(String[] args) throws IOException {
        //
     //  Ocr_Bean bean = JSON.parseObject("{\"log_id\": 5690357964435667261, \"direction\": 0, \"words_result_num\": 19, \"words_result\": [{\"vertexes_location\": [{\"y\": 68, \"x\": 363}, {\"y\": 68, \"x\": 819}, {\"y\": 153, \"x\": 819}, {\"y\": 153, \"x\": 363}], \"probability\": {\"variance\": 0.0, \"average\": 0.999835, \"min\": 0.999271}, \"chars\": [{\"char\": \"营\", \"location\": {\"width\": 53, \"top\": 68, \"left\": 363, \"height\": 88}}, {\"char\": \"养\", \"location\": {\"width\": 53, \"top\": 68, \"left\": 470, \"height\": 88}}, {\"char\": \"成\", \"location\": {\"width\": 52, \"top\": 68, \"left\": 550, \"height\": 88}}, {\"char\": \"分\", \"location\": {\"width\": 53, \"top\": 68, \"left\": 657, \"height\": 88}}, {\"char\": \"表\", \"location\": {\"width\": 53, \"top\": 68, \"left\": 738, \"height\": 88}}], \"min_finegrained_vertexes_location\": [{\"y\": 68, \"x\": 363}, {\"y\": 68, \"x\": 819}, {\"y\": 153, \"x\": 819}, {\"y\": 153, \"x\": 363}], \"finegrained_vertexes_location\": [{\"y\": 68, \"x\": 363}, {\"y\": 68, \"x\": 452}, {\"y\": 68, \"x\": 541}, {\"y\": 68, \"x\": 629}, {\"y\": 68, \"x\": 718}, {\"y\": 68, \"x\": 807}, {\"y\": 68, \"x\": 819}, {\"y\": 113, \"x\": 819}, {\"y\": 153, \"x\": 819}, {\"y\": 153, \"x\": 731}, {\"y\": 153, \"x\": 642}, {\"y\": 153, \"x\": 553}, {\"y\": 153, \"x\": 465}, {\"y\": 153, \"x\": 376}, {\"y\": 153, \"x\": 363}, {\"y\": 109, \"x\": 363}], \"location\": {\"width\": 459, \"top\": 68, \"left\": 363, \"height\": 88}, \"words\": \"营养成分表\"}, {\"vertexes_location\": [{\"y\": 278, \"x\": 606}, {\"y\": 278, \"x\": 1128}, {\"y\": 344, \"x\": 1128}, {\"y\": 344, \"x\": 606}], \"probability\": {\"variance\": 2e-05, \"average\": 0.99648, \"min\": 0.986352}, \"chars\": [{\"char\": \"每\", \"location\": {\"width\": 41, \"top\": 278, \"left\": 606, \"height\": 69}}, {\"char\": \"份\", \"location\": {\"width\": 41, \"top\": 278, \"left\": 668, \"height\": 69}}, {\"char\": \"(\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 702, \"height\": 69}}, {\"char\": \"4\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 744, \"height\": 69}}, {\"char\": \"克\", \"location\": {\"width\": 41, \"top\": 278, \"left\": 773, \"height\": 69}}, {\"char\": \")\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 827, \"height\": 69}}, {\"char\": \"N\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 954, \"height\": 69}}, {\"char\": \"R\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 995, \"height\": 69}}, {\"char\": \"V\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 1037, \"height\": 69}}, {\"char\": \"%\", \"location\": {\"width\": 34, \"top\": 278, \"left\": 1079, \"height\": 69}}], \"min_finegrained_vertexes_location\": [{\"y\": 278, \"x\": 606}, {\"y\": 278, \"x\": 1128}, {\"y\": 344, \"x\": 1128}, {\"y\": 344, \"x\": 606}], \"finegrained_vertexes_location\": [{\"y\": 278, \"x\": 606}, {\"y\": 278, \"x\": 675}, {\"y\": 278, \"x\": 744}, {\"y\": 278, \"x\": 813}, {\"y\": 278, \"x\": 882}, {\"y\": 278, \"x\": 951}, {\"y\": 278, \"x\": 1020}, {\"y\": 278, \"x\": 1089}, {\"y\": 278, \"x\": 1128}, {\"y\": 312, \"x\": 1128}, {\"y\": 344, \"x\": 1128}, {\"y\": 344, \"x\": 1059}, {\"y\": 344, \"x\": 990}, {\"y\": 344, \"x\": 921}, {\"y\": 344, \"x\": 852}, {\"y\": 344, \"x\": 783}, {\"y\": 344, \"x\": 714}, {\"y\": 344, \"x\": 645}, {\"y\": 344, \"x\": 606}, {\"y\": 310, \"x\": 606}], \"location\": {\"width\": 524, \"top\": 278, \"left\": 606, \"height\": 69}, \"words\": \"每份(4克)NRV%\"}, {\"vertexes_location\": [{\"y\": 284, \"x\": 64}, {\"y\": 284, \"x\": 117}, {\"y\": 572, \"x\": 117}, {\"y\": 572, \"x\": 64}], \"probability\": {\"variance\": 0.0, \"average\": 0.999787, \"min\": 0.999407}, \"chars\": [{\"char\": \"项\", \"location\": {\"width\": 55, \"top\": 284, \"left\": 64, \"height\": 32}}, {\"char\": \"能\", \"location\": {\"width\": 55, \"top\": 393, \"left\": 64, \"height\": 33}}, {\"char\": \"蛋\", \"location\": {\"width\": 55, \"top\": 512, \"left\": 64, \"height\": 33}}], \"min_finegrained_vertexes_location\": [{\"y\": 284, \"x\": 64}, {\"y\": 284, \"x\": 117}, {\"y\": 572, \"x\": 117}, {\"y\": 572, \"x\": 64}], \"finegrained_vertexes_location\": [{\"y\": 284, \"x\": 64}, {\"y\": 284, \"x\": 96}, {\"y\": 284, \"x\": 117}, {\"y\": 299, \"x\": 117}, {\"y\": 315, \"x\": 117}, {\"y\": 331, \"x\": 117}, {\"y\": 347, \"x\": 117}, {\"y\": 363, \"x\": 117}, {\"y\": 379, \"x\": 117}, {\"y\": 395, \"x\": 117}, {\"y\": 411, \"x\": 117}, {\"y\": 427, \"x\": 117}, {\"y\": 443, \"x\": 117}, {\"y\": 459, \"x\": 117}, {\"y\": 475, \"x\": 117}, {\"y\": 491, \"x\": 117}, {\"y\": 507, \"x\": 117}, {\"y\": 523, \"x\": 117}, {\"y\": 539, \"x\": 117}, {\"y\": 555, \"x\": 117}, {\"y\": 571, \"x\": 117}, {\"y\": 572, \"x\": 117}, {\"y\": 572, \"x\": 85}, {\"y\": 572, \"x\": 64}, {\"y\": 556, \"x\": 64}, {\"y\": 540, \"x\": 64}, {\"y\": 524, \"x\": 64}, {\"y\": 508, \"x\": 64}, {\"y\": 492, \"x\": 64}, {\"y\": 476, \"x\": 64}, {\"y\": 460, \"x\": 64}, {\"y\": 444, \"x\": 64}, {\"y\": 428, \"x\": 64}, {\"y\": 412, \"x\": 64}, {\"y\": 396, \"x\": 64}, {\"y\": 380, \"x\": 64}, {\"y\": 364, \"x\": 64}, {\"y\": 349, \"x\": 64}, {\"y\": 333, \"x\": 64}, {\"y\": 317, \"x\": 64}, {\"y\": 301, \"x\": 64}, {\"y\": 285, \"x\": 64}], \"location\": {\"width\": 55, \"top\": 284, \"left\": 64, \"height\": 290}, \"words\": \"项能蛋\"}, {\"vertexes_location\": [{\"y\": 283, \"x\": 119}, {\"y\": 283, \"x\": 169}, {\"y\": 573, \"x\": 169}, {\"y\": 573, \"x\": 119}], \"probability\": {\"variance\": 4e-06, \"average\": 0.998135, \"min\": 0.995423}, \"chars\": [{\"char\": \"目\", \"location\": {\"width\": 52, \"top\": 283, \"left\": 119, \"height\": 31}}, {\"char\": \"量\", \"location\": {\"width\": 52, \"top\": 387, \"left\": 119, \"height\": 31}}, {\"char\": \"白\", \"location\": {\"width\": 52, \"top\": 516, \"left\": 119, \"height\": 32}}], \"min_finegrained_vertexes_location\": [{\"y\": 283, \"x\": 119}, {\"y\": 283, \"x\": 169}, {\"y\": 573, \"x\": 169}, {\"y\": 573, \"x\": 119}], \"finegrained_vertexes_location\": [{\"y\": 283, \"x\": 119}, {\"y\": 283, \"x\": 149}, {\"y\": 283, \"x\": 169}, {\"y\": 298, \"x\": 169}, {\"y\": 313, \"x\": 169}, {\"y\": 328, \"x\": 169}, {\"y\": 344, \"x\": 169}, {\"y\": 359, \"x\": 169}, {\"y\": 374, \"x\": 169}, {\"y\": 389, \"x\": 169}, {\"y\": 404, \"x\": 169}, {\"y\": 420, \"x\": 169}, {\"y\": 435, \"x\": 169}, {\"y\": 450, \"x\": 169}, {\"y\": 465, \"x\": 169}, {\"y\": 480, \"x\": 169}, {\"y\": 496, \"x\": 169}, {\"y\": 511, \"x\": 169}, {\"y\": 526, \"x\": 169}, {\"y\": 541, \"x\": 169}, {\"y\": 557, \"x\": 169}, {\"y\": 572, \"x\": 169}, {\"y\": 573, \"x\": 169}, {\"y\": 573, \"x\": 138}, {\"y\": 573, \"x\": 119}, {\"y\": 558, \"x\": 119}, {\"y\": 542, \"x\": 119}, {\"y\": 527, \"x\": 119}, {\"y\": 512, \"x\": 119}, {\"y\": 497, \"x\": 119}, {\"y\": 482, \"x\": 119}, {\"y\": 466, \"x\": 119}, {\"y\": 451, \"x\": 119}, {\"y\": 436, \"x\": 119}, {\"y\": 421, \"x\": 119}, {\"y\": 405, \"x\": 119}, {\"y\": 390, \"x\": 119}, {\"y\": 375, \"x\": 119}, {\"y\": 360, \"x\": 119}, {\"y\": 345, \"x\": 119}, {\"y\": 329, \"x\": 119}, {\"y\": 314, \"x\": 119}, {\"y\": 299, \"x\": 119}, {\"y\": 284, \"x\": 119}], \"location\": {\"width\": 52, \"top\": 283, \"left\": 119, \"height\": 292}, \"words\": \"目量白\"}, {\"vertexes_location\": [{\"y\": 399, \"x\": 649}, {\"y\": 399, \"x\": 832}, {\"y\": 462, \"x\": 832}, {\"y\": 462, \"x\": 649}], \"probability\": {\"variance\": 1e-06, \"average\": 0.999241, \"min\": 0.99729}, \"chars\": [{\"char\": \"5\", \"location\": {\"width\": 32, \"top\": 399, \"left\": 649, \"height\": 65}}, {\"char\": \"1\", \"location\": {\"width\": 33, \"top\": 399, \"left\": 681, \"height\": 65}}, {\"char\": \"千\", \"location\": {\"width\": 40, \"top\": 399, \"left\": 747, \"height\": 65}}, {\"char\": \"焦\", \"location\": {\"width\": 39, \"top\": 399, \"left\": 787, \"height\": 65}}], \"min_finegrained_vertexes_location\": [{\"y\": 399, \"x\": 649}, {\"y\": 399, \"x\": 832}, {\"y\": 462, \"x\": 832}, {\"y\": 462, \"x\": 649}], \"finegrained_vertexes_location\": [{\"y\": 399, \"x\": 649}, {\"y\": 399, \"x\": 714}, {\"y\": 399, \"x\": 780}, {\"y\": 399, \"x\": 832}, {\"y\": 432, \"x\": 832}, {\"y\": 462, \"x\": 832}, {\"y\": 462, \"x\": 766}, {\"y\": 462, \"x\": 701}, {\"y\": 462, \"x\": 649}, {\"y\": 429, \"x\": 649}], \"location\": {\"width\": 186, \"top\": 399, \"left\": 649, \"height\": 65}, \"words\": \"51千焦\"}, {\"vertexes_location\": [{\"y\": 403, \"x\": 1052}, {\"y\": 403, \"x\": 1125}, {\"y\": 458, \"x\": 1125}, {\"y\": 458, \"x\": 1052}], \"probability\": {\"variance\": 0.0, \"average\": 0.999835, \"min\": 0.99973}, \"chars\": [{\"char\": \"1\", \"location\": {\"width\": 29, \"top\": 403, \"left\": 1052, \"height\": 57}}, {\"char\": \"%\", \"location\": {\"width\": 29, \"top\": 403, \"left\": 1081, \"height\": 57}}], \"min_finegrained_vertexes_location\": [{\"y\": 403, \"x\": 1051}, {\"y\": 403, \"x\": 1124}, {\"y\": 458, \"x\": 1124}, {\"y\": 458, \"x\": 1051}], \"finegrained_vertexes_location\": [{\"y\": 403, \"x\": 1052}, {\"y\": 403, \"x\": 1110}, {\"y\": 403, \"x\": 1125}, {\"y\": 431, \"x\": 1125}, {\"y\": 458, \"x\": 1125}, {\"y\": 458, \"x\": 1068}, {\"y\": 458, \"x\": 1052}, {\"y\": 429, \"x\": 1052}], \"location\": {\"width\": 76, \"top\": 403, \"left\": 1052, \"height\": 57}, \"words\": \"1%\"}, {\"vertexes_location\": [{\"y\": 515, \"x\": 172}, {\"y\": 515, \"x\": 220}, {\"y\": 575, \"x\": 220}, {\"y\": 575, \"x\": 172}], \"probability\": {\"variance\": 0.0, \"average\": 0.999972, \"min\": 0.999972}, \"chars\": [{\"char\": \"质\", \"location\": {\"width\": 37, \"top\": 515, \"left\": 172, \"height\": 62}}], \"min_finegrained_vertexes_location\": [{\"y\": 515, \"x\": 172}, {\"y\": 515, \"x\": 220}, {\"y\": 575, \"x\": 220}, {\"y\": 575, \"x\": 172}], \"finegrained_vertexes_location\": [{\"y\": 515, \"x\": 172}, {\"y\": 515, \"x\": 220}, {\"y\": 546, \"x\": 220}, {\"y\": 575, \"x\": 220}, {\"y\": 575, \"x\": 172}, {\"y\": 543, \"x\": 172}], \"location\": {\"width\": 50, \"top\": 515, \"left\": 172, \"height\": 62}, \"words\": \"质\"}, {\"vertexes_location\": [{\"y\": 516, \"x\": 678}, {\"y\": 516, \"x\": 781}, {\"y\": 579, \"x\": 781}, {\"y\": 579, \"x\": 678}], \"probability\": {\"variance\": 4e-06, \"average\": 0.997868, \"min\": 0.995754}, \"chars\": [{\"char\": \"0\", \"location\": {\"width\": 33, \"top\": 516, \"left\": 678, \"height\": 66}}, {\"char\": \"克\", \"location\": {\"width\": 40, \"top\": 516, \"left\": 737, \"height\": 66}}], \"min_finegrained_vertexes_location\": [{\"y\": 516, \"x\": 678}, {\"y\": 516, \"x\": 781}, {\"y\": 579, \"x\": 781}, {\"y\": 579, \"x\": 678}], \"finegrained_vertexes_location\": [{\"y\": 516, \"x\": 678}, {\"y\": 516, \"x\": 744}, {\"y\": 516, \"x\": 781}, {\"y\": 549, \"x\": 781}, {\"y\": 579, \"x\": 781}, {\"y\": 579, \"x\": 715}, {\"y\": 579, \"x\": 678}, {\"y\": 547, \"x\": 678}], \"location\": {\"width\": 105, \"top\": 516, \"left\": 678, \"height\": 66}, \"words\": \"0克\"}, {\"vertexes_location\": [{\"y\": 625, \"x\": 66}, {\"y\": 625, \"x\": 167}, {\"y\": 688, \"x\": 167}, {\"y\": 688, \"x\": 66}], \"probability\": {\"variance\": 0.0, \"average\": 0.999905, \"min\": 0.999838}, \"chars\": [{\"char\": \"脂\", \"location\": {\"width\": 39, \"top\": 625, \"left\": 66, \"height\": 65}}, {\"char\": \"肪\", \"location\": {\"width\": 39, \"top\": 625, \"left\": 125, \"height\": 65}}], \"min_finegrained_vertexes_location\": [{\"y\": 625, \"x\": 66}, {\"y\": 625, \"x\": 167}, {\"y\": 688, \"x\": 167}, {\"y\": 688, \"x\": 66}], \"finegrained_vertexes_location\": [{\"y\": 625, \"x\": 66}, {\"y\": 625, \"x\": 132}, {\"y\": 625, \"x\": 167}, {\"y\": 657, \"x\": 167}, {\"y\": 688, \"x\": 167}, {\"y\": 688, \"x\": 102}, {\"y\": 688, \"x\": 66}, {\"y\": 655, \"x\": 66}], \"location\": {\"width\": 104, \"top\": 625, \"left\": 66, \"height\": 65}, \"words\": \"脂肪\"}, {\"vertexes_location\": [{\"y\": 633, \"x\": 679}, {\"y\": 633, \"x\": 782}, {\"y\": 699, \"x\": 782}, {\"y\": 699, \"x\": 679}], \"probability\": {\"variance\": 1e-06, \"average\": 0.999075, \"min\": 0.998158}, \"chars\": [{\"char\": \"0\", \"location\": {\"width\": 34, \"top\": 633, \"left\": 679, \"height\": 69}}, {\"char\": \"克\", \"location\": {\"width\": 41, \"top\": 633, \"left\": 741, \"height\": 69}}], \"min_finegrained_vertexes_location\": [{\"y\": 633, \"x\": 679}, {\"y\": 633, \"x\": 782}, {\"y\": 699, \"x\": 782}, {\"y\": 699, \"x\": 679}], \"finegrained_vertexes_location\": [{\"y\": 633, \"x\": 679}, {\"y\": 633, \"x\": 748}, {\"y\": 633, \"x\": 782}, {\"y\": 668, \"x\": 782}, {\"y\": 699, \"x\": 782}, {\"y\": 699, \"x\": 713}, {\"y\": 699, \"x\": 679}, {\"y\": 665, \"x\": 679}], \"location\": {\"width\": 106, \"top\": 633, \"left\": 679, \"height\": 69}, \"words\": \"0克\"}, {\"vertexes_location\": [{\"y\": 738, \"x\": 65}, {\"y\": 738, \"x\": 324}, {\"y\": 808, \"x\": 324}, {\"y\": 808, \"x\": 65}], \"probability\": {\"variance\": 0.0, \"average\": 0.999603, \"min\": 0.998265}, \"chars\": [{\"char\": \"碳\", \"location\": {\"width\": 43, \"top\": 738, \"left\": 65, \"height\": 72}}, {\"char\": \"水\", \"location\": {\"width\": 44, \"top\": 738, \"left\": 130, \"height\": 72}}, {\"char\": \"化\", \"location\": {\"width\": 44, \"top\": 738, \"left\": 174, \"height\": 72}}, {\"char\": \"合\", \"location\": {\"width\": 43, \"top\": 738, \"left\": 241, \"height\": 72}}, {\"char\": \"物\", \"location\": {\"width\": 42, \"top\": 738, \"left\": 285, \"height\": 72}}], \"min_finegrained_vertexes_location\": [{\"y\": 738, \"x\": 65}, {\"y\": 738, \"x\": 324}, {\"y\": 808, \"x\": 324}, {\"y\": 808, \"x\": 65}], \"finegrained_vertexes_location\": [{\"y\": 738, \"x\": 65}, {\"y\": 738, \"x\": 138}, {\"y\": 738, \"x\": 211}, {\"y\": 738, \"x\": 283}, {\"y\": 738, \"x\": 324}, {\"y\": 774, \"x\": 324}, {\"y\": 808, \"x\": 324}, {\"y\": 808, \"x\": 252}, {\"y\": 808, \"x\": 179}, {\"y\": 808, \"x\": 106}, {\"y\": 808, \"x\": 65}, {\"y\": 771, \"x\": 65}], \"location\": {\"width\": 262, \"top\": 738, \"left\": 65, \"height\": 72}, \"words\": \"碳水化合物\"}, {\"vertexes_location\": [{\"y\": 524, \"x\": 1049}, {\"y\": 524, \"x\": 1080}, {\"y\": 808, \"x\": 1080}, {\"y\": 808, \"x\": 1049}], \"probability\": {\"variance\": 0.0, \"average\": 0.999982, \"min\": 0.99997}, \"chars\": [{\"char\": \"0\", \"location\": {\"width\": 32, \"top\": 524, \"left\": 1049, \"height\": 16}}, {\"char\": \"0\", \"location\": {\"width\": 32, \"top\": 637, \"left\": 1049, \"height\": 17}}, {\"char\": \"1\", \"location\": {\"width\": 32, \"top\": 758, \"left\": 1049, \"height\": 17}}], \"min_finegrained_vertexes_location\": [{\"y\": 524, \"x\": 1049}, {\"y\": 524, \"x\": 1080}, {\"y\": 808, \"x\": 1080}, {\"y\": 808, \"x\": 1049}], \"finegrained_vertexes_location\": [{\"y\": 524, \"x\": 1049}, {\"y\": 524, \"x\": 1065}, {\"y\": 524, \"x\": 1080}, {\"y\": 532, \"x\": 1080}, {\"y\": 540, \"x\": 1080}, {\"y\": 548, \"x\": 1080}, {\"y\": 556, \"x\": 1080}, {\"y\": 564, \"x\": 1080}, {\"y\": 573, \"x\": 1080}, {\"y\": 581, \"x\": 1080}, {\"y\": 589, \"x\": 1080}, {\"y\": 597, \"x\": 1080}, {\"y\": 605, \"x\": 1080}, {\"y\": 613, \"x\": 1080}, {\"y\": 621, \"x\": 1080}, {\"y\": 630, \"x\": 1080}, {\"y\": 638, \"x\": 1080}, {\"y\": 646, \"x\": 1080}, {\"y\": 654, \"x\": 1080}, {\"y\": 662, \"x\": 1080}, {\"y\": 670, \"x\": 1080}, {\"y\": 679, \"x\": 1080}, {\"y\": 687, \"x\": 1080}, {\"y\": 695, \"x\": 1080}, {\"y\": 703, \"x\": 1080}, {\"y\": 711, \"x\": 1080}, {\"y\": 719, \"x\": 1080}, {\"y\": 727, \"x\": 1080}, {\"y\": 736, \"x\": 1080}, {\"y\": 744, \"x\": 1080}, {\"y\": 752, \"x\": 1080}, {\"y\": 760, \"x\": 1080}, {\"y\": 768, \"x\": 1080}, {\"y\": 776, \"x\": 1080}, {\"y\": 784, \"x\": 1080}, {\"y\": 793, \"x\": 1080}, {\"y\": 801, \"x\": 1080}, {\"y\": 808, \"x\": 1080}, {\"y\": 808, \"x\": 1063}, {\"y\": 808, \"x\": 1049}, {\"y\": 800, \"x\": 1049}, {\"y\": 792, \"x\": 1049}, {\"y\": 784, \"x\": 1049}, {\"y\": 776, \"x\": 1049}, {\"y\": 767, \"x\": 1049}, {\"y\": 759, \"x\": 1049}, {\"y\": 751, \"x\": 1049}, {\"y\": 743, \"x\": 1049}, {\"y\": 735, \"x\": 1049}, {\"y\": 727, \"x\": 1049}, {\"y\": 719, \"x\": 1049}, {\"y\": 710, \"x\": 1049}, {\"y\": 702, \"x\": 1049}, {\"y\": 694, \"x\": 1049}, {\"y\": 686, \"x\": 1049}, {\"y\": 678, \"x\": 1049}, {\"y\": 670, \"x\": 1049}, {\"y\": 662, \"x\": 1049}, {\"y\": 653, \"x\": 1049}, {\"y\": 645, \"x\": 1049}, {\"y\": 637, \"x\": 1049}, {\"y\": 629, \"x\": 1049}, {\"y\": 621, \"x\": 1049}, {\"y\": 613, \"x\": 1049}, {\"y\": 605, \"x\": 1049}, {\"y\": 596, \"x\": 1049}, {\"y\": 588, \"x\": 1049}, {\"y\": 580, \"x\": 1049}, {\"y\": 572, \"x\": 1049}, {\"y\": 564, \"x\": 1049}, {\"y\": 556, \"x\": 1049}, {\"y\": 547, \"x\": 1049}, {\"y\": 539, \"x\": 1049}, {\"y\": 531, \"x\": 1049}], \"location\": {\"width\": 32, \"top\": 524, \"left\": 1049, \"height\": 286}, \"words\": \"001\"}, {\"vertexes_location\": [{\"y\": 522, \"x\": 1074}, {\"y\": 522, \"x\": 1127}, {\"y\": 810, \"x\": 1127}, {\"y\": 810, \"x\": 1074}], \"probability\": {\"variance\": 0.0, \"average\": 0.999805, \"min\": 0.99959}, \"chars\": [{\"char\": \"%\", \"location\": {\"width\": 55, \"top\": 522, \"left\": 1074, \"height\": 27}}, {\"char\": \"%\", \"location\": {\"width\": 55, \"top\": 627, \"left\": 1074, \"height\": 28}}, {\"char\": \"%\", \"location\": {\"width\": 55, \"top\": 747, \"left\": 1074, \"height\": 27}}], \"min_finegrained_vertexes_location\": [{\"y\": 522, \"x\": 1074}, {\"y\": 522, \"x\": 1127}, {\"y\": 810, \"x\": 1127}, {\"y\": 810, \"x\": 1074}], \"finegrained_vertexes_location\": [{\"y\": 522, \"x\": 1074}, {\"y\": 522, \"x\": 1102}, {\"y\": 522, \"x\": 1127}, {\"y\": 535, \"x\": 1127}, {\"y\": 549, \"x\": 1127}, {\"y\": 563, \"x\": 1127}, {\"y\": 577, \"x\": 1127}, {\"y\": 591, \"x\": 1127}, {\"y\": 604, \"x\": 1127}, {\"y\": 618, \"x\": 1127}, {\"y\": 632, \"x\": 1127}, {\"y\": 646, \"x\": 1127}, {\"y\": 659, \"x\": 1127}, {\"y\": 673, \"x\": 1127}, {\"y\": 687, \"x\": 1127}, {\"y\": 701, \"x\": 1127}, {\"y\": 715, \"x\": 1127}, {\"y\": 728, \"x\": 1127}, {\"y\": 742, \"x\": 1127}, {\"y\": 756, \"x\": 1127}, {\"y\": 770, \"x\": 1127}, {\"y\": 784, \"x\": 1127}, {\"y\": 797, \"x\": 1127}, {\"y\": 810, \"x\": 1127}, {\"y\": 810, \"x\": 1100}, {\"y\": 810, \"x\": 1074}, {\"y\": 796, \"x\": 1074}, {\"y\": 782, \"x\": 1074}, {\"y\": 769, \"x\": 1074}, {\"y\": 755, \"x\": 1074}, {\"y\": 741, \"x\": 1074}, {\"y\": 727, \"x\": 1074}, {\"y\": 713, \"x\": 1074}, {\"y\": 700, \"x\": 1074}, {\"y\": 686, \"x\": 1074}, {\"y\": 672, \"x\": 1074}, {\"y\": 658, \"x\": 1074}, {\"y\": 645, \"x\": 1074}, {\"y\": 631, \"x\": 1074}, {\"y\": 617, \"x\": 1074}, {\"y\": 603, \"x\": 1074}, {\"y\": 589, \"x\": 1074}, {\"y\": 576, \"x\": 1074}, {\"y\": 562, \"x\": 1074}, {\"y\": 548, \"x\": 1074}, {\"y\": 534, \"x\": 1074}], \"location\": {\"width\": 55, \"top\": 522, \"left\": 1074, \"height\": 290}, \"words\": \"%%%\"}, {\"vertexes_location\": [{\"y\": 751, \"x\": 631}, {\"y\": 751, \"x\": 781}, {\"y\": 815, \"x\": 781}, {\"y\": 815, \"x\": 631}], \"probability\": {\"variance\": 0.000382, \"average\": 0.988642, \"min\": 0.954771}, \"chars\": [{\"char\": \"3\", \"location\": {\"width\": 33, \"top\": 751, \"left\": 631, \"height\": 66}}, {\"char\": \".\", \"location\": {\"width\": 33, \"top\": 751, \"left\": 665, \"height\": 66}}, {\"char\": \"0\", \"location\": {\"width\": 33, \"top\": 751, \"left\": 684, \"height\": 66}}, {\"char\": \"克\", \"location\": {\"width\": 40, \"top\": 751, \"left\": 732, \"height\": 66}}], \"min_finegrained_vertexes_location\": [{\"y\": 751, \"x\": 631}, {\"y\": 751, \"x\": 781}, {\"y\": 815, \"x\": 781}, {\"y\": 815, \"x\": 631}], \"finegrained_vertexes_location\": [{\"y\": 751, \"x\": 631}, {\"y\": 751, \"x\": 698}, {\"y\": 751, \"x\": 765}, {\"y\": 751, \"x\": 781}, {\"y\": 784, \"x\": 781}, {\"y\": 815, \"x\": 781}, {\"y\": 815, \"x\": 714}, {\"y\": 815, \"x\": 647}, {\"y\": 815, \"x\": 631}, {\"y\": 782, \"x\": 631}], \"location\": {\"width\": 152, \"top\": 751, \"left\": 631, \"height\": 66}, \"words\": \"3.0克\"}, {\"vertexes_location\": [{\"y\": 849, \"x\": 66}, {\"y\": 849, \"x\": 116}, {\"y\": 913, \"x\": 116}, {\"y\": 913, \"x\": 66}], \"probability\": {\"variance\": 0.0, \"average\": 0.999585, \"min\": 0.999585}, \"chars\": [{\"char\": \"钠\", \"location\": {\"width\": 40, \"top\": 849, \"left\": 66, \"height\": 67}}], \"min_finegrained_vertexes_location\": [{\"y\": 849, \"x\": 66}, {\"y\": 849, \"x\": 116}, {\"y\": 913, \"x\": 116}, {\"y\": 913, \"x\": 66}], \"finegrained_vertexes_location\": [{\"y\": 849, \"x\": 66}, {\"y\": 849, \"x\": 116}, {\"y\": 882, \"x\": 116}, {\"y\": 913, \"x\": 116}, {\"y\": 913, \"x\": 66}, {\"y\": 880, \"x\": 66}], \"location\": {\"width\": 53, \"top\": 849, \"left\": 66, \"height\": 67}, \"words\": \"钠\"}, {\"vertexes_location\": [{\"y\": 868, \"x\": 617}, {\"y\": 868, \"x\": 833}, {\"y\": 929, \"x\": 833}, {\"y\": 929, \"x\": 617}], \"probability\": {\"variance\": 0.0, \"average\": 0.999844, \"min\": 0.999687}, \"chars\": [{\"char\": \"3\", \"location\": {\"width\": 31, \"top\": 868, \"left\": 617, \"height\": 64}}, {\"char\": \"4\", \"location\": {\"width\": 32, \"top\": 868, \"left\": 648, \"height\": 64}}, {\"char\": \"0\", \"location\": {\"width\": 31, \"top\": 868, \"left\": 687, \"height\": 64}}, {\"char\": \"毫\", \"location\": {\"width\": 38, \"top\": 868, \"left\": 732, \"height\": 64}}, {\"char\": \"克\", \"location\": {\"width\": 38, \"top\": 868, \"left\": 789, \"height\": 64}}], \"min_finegrained_vertexes_location\": [{\"y\": 868, \"x\": 616}, {\"y\": 868, \"x\": 832}, {\"y\": 929, \"x\": 832}, {\"y\": 929, \"x\": 616}], \"finegrained_vertexes_location\": [{\"y\": 868, \"x\": 617}, {\"y\": 868, \"x\": 680}, {\"y\": 868, \"x\": 744}, {\"y\": 868, \"x\": 807}, {\"y\": 868, \"x\": 833}, {\"y\": 900, \"x\": 833}, {\"y\": 929, \"x\": 833}, {\"y\": 929, \"x\": 769}, {\"y\": 929, \"x\": 705}, {\"y\": 929, \"x\": 642}, {\"y\": 929, \"x\": 617}, {\"y\": 898, \"x\": 617}], \"location\": {\"width\": 218, \"top\": 868, \"left\": 617, \"height\": 64}, \"words\": \"340毫克\"}, {\"vertexes_location\": [{\"y\": 874, \"x\": 1018}, {\"y\": 874, \"x\": 1121}, {\"y\": 926, \"x\": 1121}, {\"y\": 926, \"x\": 1018}], \"probability\": {\"variance\": 0.0, \"average\": 0.999895, \"min\": 0.999866}, \"chars\": [{\"char\": \"1\", \"location\": {\"width\": 27, \"top\": 874, \"left\": 1018, \"height\": 54}}, {\"char\": \"7\", \"location\": {\"width\": 26, \"top\": 874, \"left\": 1045, \"height\": 54}}, {\"char\": \"%\", \"location\": {\"width\": 27, \"top\": 874, \"left\": 1077, \"height\": 54}}], \"min_finegrained_vertexes_location\": [{\"y\": 874, \"x\": 1018}, {\"y\": 874, \"x\": 1121}, {\"y\": 926, \"x\": 1121}, {\"y\": 926, \"x\": 1018}], \"finegrained_vertexes_location\": [{\"y\": 874, \"x\": 1018}, {\"y\": 874, \"x\": 1072}, {\"y\": 874, \"x\": 1121}, {\"y\": 901, \"x\": 1121}, {\"y\": 926, \"x\": 1121}, {\"y\": 926, \"x\": 1067}, {\"y\": 926, \"x\": 1018}, {\"y\": 899, \"x\": 1018}], \"location\": {\"width\": 105, \"top\": 874, \"left\": 1018, \"height\": 54}, \"words\": \"17%\"}, {\"vertexes_location\": [{\"y\": 963, \"x\": 65}, {\"y\": 963, \"x\": 257}, {\"y\": 1028, \"x\": 257}, {\"y\": 1028, \"x\": 65}], \"probability\": {\"variance\": 0.000253, \"average\": 0.989892, \"min\": 0.962388}, \"chars\": [{\"char\": \"维\", \"location\": {\"width\": 41, \"top\": 963, \"left\": 65, \"height\": 68}}, {\"char\": \"生\", \"location\": {\"width\": 41, \"top\": 963, \"left\": 127, \"height\": 68}}, {\"char\": \"素\", \"location\": {\"width\": 41, \"top\": 963, \"left\": 168, \"height\": 68}}, {\"char\": \"C\", \"location\": {\"width\": 34, \"top\": 963, \"left\": 224, \"height\": 68}}], \"min_finegrained_vertexes_location\": [{\"y\": 963, \"x\": 65}, {\"y\": 963, \"x\": 257}, {\"y\": 1028, \"x\": 257}, {\"y\": 1028, \"x\": 65}], \"finegrained_vertexes_location\": [{\"y\": 963, \"x\": 65}, {\"y\": 963, \"x\": 134}, {\"y\": 963, \"x\": 203}, {\"y\": 963, \"x\": 257}, {\"y\": 997, \"x\": 257}, {\"y\": 1028, \"x\": 257}, {\"y\": 1028, \"x\": 188}, {\"y\": 1028, \"x\": 120}, {\"y\": 1028, \"x\": 65}, {\"y\": 994, \"x\": 65}], \"location\": {\"width\": 194, \"top\": 963, \"left\": 65, \"height\": 68}, \"words\": \"维生素C\"}, {\"vertexes_location\": [{\"y\": 983, \"x\": 575}, {\"y\": 983, \"x\": 1122}, {\"y\": 1045, \"x\": 1122}, {\"y\": 1045, \"x\": 575}], \"probability\": {\"variance\": 5.6e-05, \"average\": 0.996727, \"min\": 0.973984}, \"chars\": [{\"char\": \"1\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 575, \"height\": 65}}, {\"char\": \"3\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 587, \"height\": 65}}, {\"char\": \"0\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 626, \"height\": 65}}, {\"char\": \".\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 646, \"height\": 65}}, {\"char\": \"0\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 685, \"height\": 65}}, {\"char\": \"毫\", \"location\": {\"width\": 39, \"top\": 983, \"left\": 731, \"height\": 65}}, {\"char\": \"克\", \"location\": {\"width\": 39, \"top\": 983, \"left\": 789, \"height\": 65}}, {\"char\": \"1\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 980, \"height\": 65}}, {\"char\": \"3\", \"location\": {\"width\": 38, \"top\": 983, \"left\": 1006, \"height\": 65}}, {\"char\": \"0\", \"location\": {\"width\": 32, \"top\": 983, \"left\": 1039, \"height\": 65}}, {\"char\": \"%\", \"location\": {\"width\": 33, \"top\": 983, \"left\": 1078, \"height\": 65}}], \"min_finegrained_vertexes_location\": [{\"y\": 983, \"x\": 575}, {\"y\": 983, \"x\": 1122}, {\"y\": 1045, \"x\": 1122}, {\"y\": 1045, \"x\": 575}], \"finegrained_vertexes_location\": [{\"y\": 983, \"x\": 575}, {\"y\": 983, \"x\": 639}, {\"y\": 983, \"x\": 704}, {\"y\": 983, \"x\": 769}, {\"y\": 983, \"x\": 834}, {\"y\": 983, \"x\": 899}, {\"y\": 983, \"x\": 964}, {\"y\": 983, \"x\": 1028}, {\"y\": 983, \"x\": 1093}, {\"y\": 983, \"x\": 1122}, {\"y\": 1016, \"x\": 1122}, {\"y\": 1045, \"x\": 1122}, {\"y\": 1045, \"x\": 1057}, {\"y\": 1045, \"x\": 992}, {\"y\": 1045, \"x\": 927}, {\"y\": 1045, \"x\": 862}, {\"y\": 1045, \"x\": 797}, {\"y\": 1045, \"x\": 733}, {\"y\": 1045, \"x\": 668}, {\"y\": 1045, \"x\": 603}, {\"y\": 1045, \"x\": 575}, {\"y\": 1013, \"x\": 575}], \"location\": {\"width\": 549, \"top\": 983, \"left\": 575, \"height\": 65}, \"words\": \"130.0毫克130%\"}]}\n", Ocr_Bean.class);
      Ocr_Bean bean = General.getMessage("C:\\Users\\Administrator\\Desktop\\image.jpg");
                 //   ceShi(bean);

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
