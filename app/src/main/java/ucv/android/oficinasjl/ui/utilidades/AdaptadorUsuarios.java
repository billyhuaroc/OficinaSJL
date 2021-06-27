package ucv.android.oficinasjl.ui.utilidades;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import ucv.android.oficinasjl.ui.clases.Usuario;

public class AdaptadorUsuarios extends BaseAdapter {

    List<Usuario> lst;

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView nombre;
        return null;
    }
}
