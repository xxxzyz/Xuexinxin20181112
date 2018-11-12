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

import module.Grid;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:九宫格adapter
 */
public class GridAdapter extends BaseAdapter {
  private SuccessActivity mSuccessActivity;
  private ArrayList<Grid.DataBean> list;
    public GridAdapter(SuccessActivity successActivity) {
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
            convertView=View.inflate(mSuccessActivity, R.layout.item,null);
            vh.iv=convertView.findViewById(R.id.grid_iv);
            convertView.setTag(vh);
        } else {
            vh= (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(list.get(position).getIcon(),vh.iv);
        return convertView;
    }
 /*
 更新适配器数据
  */
    public void setData(ArrayList<Grid.DataBean> dataBeans) {
        for (int i = 0; i < 9; i++) {
            list.add(dataBeans.get(i));
        }
        notifyDataSetChanged();
    }

    class ViewHolder{
       ImageView iv;
    }
}
