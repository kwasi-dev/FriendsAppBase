package dev.kwasi.friendsappbase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FriendAdapter extends BaseAdapter {
    private final ArrayList<Friend> items = new ArrayList<>();
    private final Context context;

    public FriendAdapter(Context ctx){
        this.context = ctx;
        this.reloadItems();
    }

    public void reloadItems(){
        items.clear();

        //TODO: Write the code to load the list of friends from the file "friends.dat" here and save it to the 'items' variable


        this.notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Friend getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            v = vi.inflate(R.layout.item_friend, null);
        }
        Friend f = getItem(position);

        ImageView ivProfilePic =v.findViewById(R.id.iv_profile_pic);
        ivProfilePic.setImageResource(R.drawable.profile_pic);

        TextView tvName =v.findViewById(R.id.tv_name);
        tvName.setText(f.getFirstName() + " " + f.getLastName());

        TextView tvStatus = v.findViewById(R.id.tv_status);
        tvStatus.setText(f.getStatus());

        return v;
    }
}
