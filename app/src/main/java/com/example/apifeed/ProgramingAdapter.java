package com.example.apifeed;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProgramingAdapter extends RecyclerView.Adapter<ProgramingAdapter.Programingviewholder> {
    ArrayList datalist;
    Context context;
    public ProgramingAdapter(ArrayList list,Context context) {
        this.datalist=list;
        this.context=context;

    }

    @NonNull
    @Override
    public Programingviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        LayoutInflater inflater =LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list,viewGroup,false);
        return new Programingviewholder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull Programingviewholder programingviewholder, int i) {

        Data data= (Data) datalist.get(i);
//        Glide.with(context).load(data.getEmployee_image()).into(programingviewholder.img);
//
//        programingviewholder.texttitle1.setText(data.getEmployee_age());
//        programingviewholder.texttitle2.setText(data.getEmployee_name());
//        programingviewholder.texttitle3.setText(data.getEmployee_salary());
//        programingviewholder.texttitle4.setText(data.getId());
//


//        UserData userData= userDataList.get(i);
//        profileViewHolder.textView1.setText(userData.getUserList().getName());
//        profileViewHolder.textView2.setText(userData.getCityName());
//        profileViewHolder.textView3.setText(userData.getDateUpdated());
//        // profileViewHolder.textView4.setText(userData.getLikeCount());
//        Glide
//                .with(context)
//                .load(userData.getUserList().getImage())
//                .centerCrop()
//                .into(profileViewHolder.imageView);
//

        Glide.with(context).load(data.getUrl()).into(programingviewholder.img);
        programingviewholder.texttitle1.setText(data.getTitle());
        programingviewholder.texttitle2.setText(data.getDescription());
        programingviewholder.texttitle3.setText(data.getAuthor());
    }


    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class Programingviewholder extends RecyclerView.ViewHolder
    {

        ImageView img;
        TextView texttitle1,texttitle2,texttitle3,texttitle4,texttitle5;
        public Programingviewholder(@NonNull View itemView) {
            super(itemView);

           img= itemView.findViewById(R.id.img);
            texttitle1=itemView.findViewById(R.id.texttitle1);
            texttitle2=itemView.findViewById(R.id.texttitle2);
            texttitle3=itemView.findViewById(R.id.texttitle3);
           // texttitle4=itemView.findViewById(R.id.texttitle4);
            //texttitle5=itemView.findViewById(R.id.texttitle5);
        }

    }
}
