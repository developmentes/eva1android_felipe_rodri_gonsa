package adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.inacap.felipe_gonsa_rodri.R;

import java.util.List;

import model.HarryPotter;

public class HarryAdapter extends RecyclerView.Adapter<HarryAdapter.HarryHolder>{

    public List<HarryPotter> list;
    public Activity activity;
    public int layout;


    public HarryAdapter(Activity activity, List<HarryPotter> list, int layout) {
        this.list = list;
        this.activity = activity;
        this.layout = layout;
    }




    @NonNull
    @Override
    public HarryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        return new HarryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HarryHolder holder, int position) {

        HarryPotter harry = list.get(position);
            holder.nameHarry.setText(harry.getName());
            holder.speciesHarry.setText(harry.getSpecies());
            holder.genderHarry.setText(harry.getGender());
            holder.url_image = harry.getImage();
            Glide.with(activity).load(harry.getImage()).into(holder.harryCircleImg);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class HarryHolder extends RecyclerView.ViewHolder {

       ImageView harryCircleImg;
       TextView nameHarry;
       TextView speciesHarry;
       TextView genderHarry;
       RelativeLayout item_card;
       Button botonHarry;

//       TextView nameHarry2;
//       TextView speciesHarry2;
//       TextView genderHarry2;

        String url_image;

        public HarryHolder(@NonNull View itemView) {
            super(itemView);

            harryCircleImg = itemView.findViewById(R.id.harrycircleimg);
            nameHarry      = itemView.findViewById(R.id.nameharry);
            speciesHarry   = itemView.findViewById(R.id.speciesharry);
            genderHarry    = itemView.findViewById(R.id.genderharry);
            item_card      = itemView.findViewById(R.id.item_card);
//            fondo_Relative      = itemView.findViewById(R.id.fondo_relative);
//            background_Relative      = itemView.findViewById(R.id.background_relative);
            botonHarry      = itemView.findViewById(R.id.botonharry);
//            nameHarry2     = itemView.findViewById(R.id.nameharry2);
//            speciesHarry2  = itemView.findViewById(R.id.speciesharry2);
//            genderHarry2   = itemView.findViewById(R.id.genderharry2);


        }//end constructor

    }//end HarryHolder

}//end HarryAdapter
