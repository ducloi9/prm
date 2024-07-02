package food.app.demo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    List<FoodItemModel> list;
    Context context;

    public FoodAdapter(List<FoodItemModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item_layout, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodItemModel item = list.get(position);

        holder.food_image.setImageResource(item.getImageResource());
        holder.food_name.setText(item.getName());
        holder.food_price.setText(item.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("food_name", item.getName());
                intent.putExtra("food_price", item.getPrice());
                intent.putExtra("food_image", item.getImageResource());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView food_image;
        TextView food_name, food_price;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            food_image = itemView.findViewById(R.id.food_image);
            food_name = itemView.findViewById(R.id.food_name);
            food_price = itemView.findViewById(R.id.food_price);
        }
    }
}
