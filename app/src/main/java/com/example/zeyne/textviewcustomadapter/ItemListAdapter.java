package com.example.zeyne.textviewcustomadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Item> mitemList;

    public ItemListAdapter(Context mContext, List<Item> mitemList) {
        this.mContext = mContext;
        this.mitemList = mitemList;
    }

    @Override
    public int getCount() {
        return mitemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mitemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v= View.inflate(mContext,R.layout.item_list,null);
        TextView groupname=(TextView) v.findViewById(R.id.tv_groupname);
        TextView valuename=(TextView) v.findViewById(R.id.tv_valuename);

        groupname.setText(mitemList.get(position).getGroupname());
        valuename.setText(String.valueOf(mitemList.get(position).getValuename()));

        v.setTag(mitemList.get(position).getId());
        return v;
    }
}
