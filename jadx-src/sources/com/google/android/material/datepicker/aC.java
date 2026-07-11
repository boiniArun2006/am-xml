package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.android.material.datepicker.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class aC extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CalendarConstraints f58936n;
    private final I28.qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f58937t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class j implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f58938n;

        j(MaterialCalendarGridView materialCalendarGridView) {
            this.f58938n = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            if (this.f58938n.getAdapter().ck(i2)) {
                aC.this.rl.n(this.f58938n.getAdapter().getItem(i2).longValue());
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class n extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final TextView f58940n;
        final MaterialCalendarGridView rl;

        n(LinearLayout linearLayout, boolean z2) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(Rxk.Wre.XQ);
            this.f58940n = textView;
            ViewCompat.xg(textView, true);
            this.rl = (MaterialCalendarGridView) linearLayout.findViewById(Rxk.Wre.Ik);
            if (!z2) {
                textView.setVisibility(8);
            }
        }
    }

    int HI(Month month) {
        return this.f58936n.gh().qie(month);
    }

    Month az(int i2) {
        return this.f58936n.gh().gh(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(n nVar, int i2) {
        Month monthGh = this.f58936n.gh().gh(i2);
        nVar.f58940n.setText(monthGh.xMQ());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) nVar.rl.findViewById(Rxk.Wre.Ik);
        if (materialCalendarGridView.getAdapter() == null || !monthGh.equals(materialCalendarGridView.getAdapter().f58891n)) {
            Dsr dsr = new Dsr(monthGh, null, this.f58936n, null);
            materialCalendarGridView.setNumColumns(monthGh.J2);
            materialCalendarGridView.setAdapter((ListAdapter) dsr);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().HI(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new j(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58936n.xMQ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return this.f58936n.gh().gh(i2).mUb();
    }

    aC(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, I28.qz qzVar) {
        int iNHg;
        Month monthGh = calendarConstraints.gh();
        Month monthUo = calendarConstraints.Uo();
        Month monthMUb = calendarConstraints.mUb();
        if (monthGh.compareTo(monthMUb) <= 0) {
            if (monthMUb.compareTo(monthUo) <= 0) {
                int iNHg2 = Dsr.f58889r * I28.nHg(context);
                if (CN3.N(context)) {
                    iNHg = I28.nHg(context);
                } else {
                    iNHg = 0;
                }
                this.f58937t = iNHg2 + iNHg;
                this.f58936n = calendarConstraints;
                this.rl = qzVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException(jhotmBbwMbr.JiUlznOatVyg);
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public n onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(Rxk.fuX.WPU, viewGroup, false);
        if (CN3.N(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f58937t));
            return new n(linearLayout, true);
        }
        return new n(linearLayout, false);
    }

    CharSequence ty(int i2) {
        return az(i2).xMQ();
    }
}
