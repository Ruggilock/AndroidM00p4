package com.absortio.m00p4.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.absortio.m00p4.R;
import com.absortio.m00p4.model.Custom;
import com.absortio.m00p4.model.Kardex;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by ruggi on 11/23/17.
 */

public class KardexAdapter extends RecyclerView.Adapter<KardexAdapter.KardexViewHolder> {
    private List<Custom> customs;

    public static class KardexViewHolder extends RecyclerView.ViewHolder {
        public TextView cantidad;
        public TextView motivo;
        public TextView lote;
        public TextView tipo;

        public KardexViewHolder(View v) {
            super(v);
            cantidad = v.findViewById(R.id.cantidad);
            motivo = v.findViewById(R.id.motivo);
            lote = v.findViewById(R.id.lote);
            tipo = v.findViewById(R.id.tipo);

        }
    }


    public KardexAdapter(List<Custom> customs) {
        this.customs = customs;
    }

    @Override
    public KardexAdapter.KardexViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_kardex, parent, false);
        return new KardexViewHolder(v);
    }

    @Override
    public void onBindViewHolder(KardexAdapter.KardexViewHolder holder, int position) {
        holder.cantidad.setText(customs.get(position).getCantidad()+"");
        holder.motivo.setText(customs.get(position).getMotivoOperacion()+"");
        holder.lote.setText(customs.get(position).getNombreProducto()+"");
        holder.tipo.setText(customs.get(position).getTipoOperacion());
    }

    @Override
    public int getItemCount() {
        return customs.size();
    }
}
