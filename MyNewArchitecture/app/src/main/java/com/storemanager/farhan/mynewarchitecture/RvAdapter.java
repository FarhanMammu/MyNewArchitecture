package com.storemanager.farhan.mynewarchitecture;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.storemanager.farhan.mynewarchitecture.helper.BaseRecyclerviewAdapter;

import java.util.List;


/**
 * Created by ConceptCarton
 */

public class RvAdapter extends BaseRecyclerviewAdapter<ModelClass> {
    private static final String TAG = "comments ada rv";
    private Context context;

    public RvAdapter(Context context, List<ModelClass> models) {
        super(models);
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_design, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return  12;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        onBindViewHolder((ViewHolder) holder, position);

    }

    public void onBindViewHolder(final ViewHolder holder, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView text;
        private Button button;

        public ViewHolder(final View itemView) {
            super(itemView);

            text=(TextView) itemView.findViewById(R.id.text);
            button= (Button)itemView.findViewById(R.id.button);

        }
    }
}
