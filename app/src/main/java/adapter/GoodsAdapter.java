package adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.xuexinxin.R;
import com.bwie.xuexinxin.SuccessActivity;
import com.nostra13.universalimageloader.core.ImageLoader;


import java.util.ArrayList;

import module.Goods;
import module.Grid;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:九宫格adapter
 */
public class GoodsAdapter extends BaseAdapter {
  private SuccessActivity mSuccessActivity;
  private ArrayList<Goods.DataBean> list;
    public GoodsAdapter(SuccessActivity successActivity) {
        this.mSuccessActivity=successActivity;
        list=new ArrayList<>();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(mSuccessActivity, R.layout.item_goods,null);
            vh.iv=convertView.findViewById(R.id.goods_iv);
            vh.name=convertView.findViewById(R.id.goods_name);
            vh.price=convertView.findViewById(R.id.goods_price);
            convertView.setTag(vh);
        } else {
            vh= (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(list.get(position).getPic_url(),vh.iv);
        vh.name.setText(list.get(position).getName());
        vh.price.setText(list.get(position).getAverage_price_tip());

        return convertView;
    }
 /*
 更新适配器数据
  */
    public void setData(ArrayList<Goods.DataBean> dataBeans) {
       list=dataBeans;
        notifyDataSetChanged();
    }

    class ViewHolder{
       ImageView iv;
       TextView name,price;
    }
}
