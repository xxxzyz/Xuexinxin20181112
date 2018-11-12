package module;

import java.util.List;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:
 */
public class Goods {

    /**
     * status : 200
     * message : 获取餐馆列表成功
     * data : [{"_id":"5ac5af803714cc2d644f4615","id":32,"name":"麦当当的店","month_sales":194,"month_sales_tip":"月售194笔","wm_poi_score":3,"delivery_score":2.1,"quality_score":3.7,"pack_score":4.1,"food_score":1.1,"delivery_time_tip":"1525.9分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/fdd295e7650587269e0f1d7c35ba180c114177.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":10,"min_price_tip":"起送 ￥10","shipping_fee":0,"shipping_fee_tip":"配送 ￥0","bulletin":"理工短号615592（原大学生粗粮坊）做你身边最快的外卖！","address":"东莞市大岭山镇元岭村翠园街7巷20号102铺","call_center":"15916985301","distance":"2146.3km","average_price_tip":"人均20","comment_number":53,"lng":"113.854074","lat":"22.901119","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]},{"_id":"5ac5b4383714cc2d644f4696","id":33,"name":"伏牛炸鸡汉堡","month_sales":173,"month_sales_tip":"月售173笔","wm_poi_score":1.6,"delivery_score":3.1,"quality_score":1.3,"pack_score":1.8,"food_score":0.7,"delivery_time_tip":"1525.4分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/55493399bb1c6e4884ff9456f92a391119693.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":10,"min_price_tip":"起送 ￥10","shipping_fee":0,"shipping_fee_tip":"配送 ￥0","bulletin":"理工专送，新旧男生宿舍下单都送到宿舍楼上。女生下楼领取。1点半到4点接受预订单。","address":"东莞市大岭山镇元岭村元岭综合市场1140号铺位","call_center":"15024098870","distance":"2146.2km","average_price_tip":"人均20","comment_number":50,"lng":"113.854364","lat":"22.902121","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]},{"_id":"5ac5b7fb3714cc2d644f4756","id":35,"name":"潇湘粤语（东城万达店）","month_sales":28,"month_sales_tip":"月售28笔","wm_poi_score":2,"delivery_score":3.5,"quality_score":0.5,"pack_score":0.8,"food_score":1.6,"delivery_time_tip":"1521.1分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/4f5897d268ec95176d8afd4bf6e8a7252376.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":20,"min_price_tip":"起送 ￥20","shipping_fee":4,"shipping_fee_tip":"配送 ￥4","bulletin":"亲，记得点米饭哦！！\n 即日起：凡在本店下单送免费小吃一份\n               订单满200元送水果一份","address":"东城区万达广场室内步行街三层3016","call_center":"076987006660","distance":"2169.6km","average_price_tip":"人均20","comment_number":45,"lng":"113.780507","lat":"23.034935","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]},{"_id":"5ac5ba2f3714cc2d644f47f1","id":36,"name":"麦当劳（东城万达店）","month_sales":32,"month_sales_tip":"月售32笔","wm_poi_score":2.8,"delivery_score":2.8,"quality_score":3.4,"pack_score":3.6,"food_score":0.3,"delivery_time_tip":"1520.1分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/851a8deb169f4f8aab16a7688932328f5634.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":20,"min_price_tip":"起送 ￥20","shipping_fee":3,"shipping_fee_tip":"配送 ￥3","bulletin":"欢迎下单","address":"东城区东纵大道万达广场2楼2027/2028号商铺","call_center":"0769-83785043","distance":"2164.0km","average_price_tip":"人均20","comment_number":41,"lng":"113.779576","lat":"23.035256","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * _id : 5ac5af803714cc2d644f4615
         * id : 32
         * name : 麦当当的店
         * month_sales : 194
         * month_sales_tip : 月售194笔
         * wm_poi_score : 3
         * delivery_score : 2.1
         * quality_score : 3.7
         * pack_score : 4.1
         * food_score : 1.1
         * delivery_time_tip : 1525.9分钟
         * third_category : 中式简餐
         * pic_url : http://p0.meituan.net/xianfu/fdd295e7650587269e0f1d7c35ba180c114177.jpg
         * shopping_time_start : 8:00
         * shopping_time_end : 24:00
         * min_price : 10
         * min_price_tip : 起送 ￥10
         * shipping_fee : 0
         * shipping_fee_tip : 配送 ￥0
         * bulletin : 理工短号615592（原大学生粗粮坊）做你身边最快的外卖！
         * address : 东莞市大岭山镇元岭村翠园街7巷20号102铺
         * call_center : 15916985301
         * distance : 2146.3km
         * average_price_tip : 人均20
         * comment_number : 53
         * lng : 113.854074
         * lat : 22.901119
         * __v : 0
         * created_at : 2018-04-05T05:08:44.533Z
         * discounts2 : [{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]
         */

        private String name;
        private String pic_url;
        private String average_price_tip;
        private String lat;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getAverage_price_tip() {
            return average_price_tip;
        }

        public void setAverage_price_tip(String average_price_tip) {
            this.average_price_tip = average_price_tip;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public static class Discounts2Bean {
            /**
             * info : 满20减18;满45减40;满60减53
             * icon_url : http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png
             * promotion_type : 2
             */

            private String info;
            private String icon_url;
            private int promotion_type;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public int getPromotion_type() {
                return promotion_type;
            }

            public void setPromotion_type(int promotion_type) {
                this.promotion_type = promotion_type;
            }
        }
    }
}
