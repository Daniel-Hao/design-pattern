package com.daniel.www.designpattern;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * desc:DesignAdapter
 * Author: Daniel
 * Date: 2017-01-05 10:52
 */
public class DesignAdapter extends RecyclerView.Adapter<DesignAdapter.MyViewHolder> {

    private Context mContext;
    private List<String> mDatas;
    private OnItemListener mOnItemListener;

    public DesignAdapter(Context context, List<String> datas) {

        this.mDatas = datas;
        this.mContext = context;
    }

    public void setOnItemClicked(OnItemListener onItemListener) {
        this.mOnItemListener = onItemListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(mContext).
                inflate(R.layout.item_design, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (holder instanceof MyViewHolder) {
            holder.btn.setText(mDatas.get(position));

            holder.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemListener.onItemListener(position, holder.btn.getText().toString());
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        Button btn;

        public MyViewHolder(View view) {
            super(view);
            btn = (Button) view.findViewById(R.id.btn);
        }
    }

    public interface OnItemListener {
        void onItemListener(int position, String text);
    }
}
