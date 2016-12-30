package pe.devpicon.android.kotlindevs;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armando on 11/26/2016.
 */

public class MyJavaAdapter extends RecyclerView.Adapter<MyJavaAdapter.ViewHolder> {

    private List<String> items;

    public MyJavaAdapter() {
        this.items = new ArrayList<>();
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public ViewHolder(TextView itemView) {
            super(itemView);
            this.textView = itemView;
        }


    }


}
