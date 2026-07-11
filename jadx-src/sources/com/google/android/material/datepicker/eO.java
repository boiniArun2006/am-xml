package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class eO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f58941n;

    public static class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final TextView f58942n;

        j(TextView textView) {
            super(textView);
            this.f58942n = textView;
        }
    }

    int az(int i2) {
        return this.f58941n.e().gh().f58926O + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58941n.e().qie();
    }

    int qie(int i2) {
        return i2 - this.f58941n.e().gh().f58926O;
    }

    eO(I28 i28) {
        this.f58941n = i28;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new j((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Rxk.fuX.ViF, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j jVar, int i2) {
        int iAz = az(i2);
        jVar.f58942n.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iAz)));
        TextView textView = jVar.f58942n;
        textView.setContentDescription(w6.O(textView.getContext(), iAz));
        n nVarX = this.f58941n.X();
        if (Xo.Uo().get(1) == iAz) {
            com.google.android.material.datepicker.j jVar2 = nVarX.J2;
        } else {
            com.google.android.material.datepicker.j jVar3 = nVarX.nr;
        }
        this.f58941n.N();
        throw null;
    }
}
