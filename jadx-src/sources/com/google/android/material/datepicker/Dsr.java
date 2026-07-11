package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class Dsr extends BaseAdapter {
    final CalendarConstraints J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    n f58890O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Month f58891n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Collection f58892t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f58889r = Xo.xMQ().getMaximum(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f58888o = (Xo.xMQ().getMaximum(5) + Xo.xMQ().getMaximum(7)) - 1;

    private boolean KN(long j2) {
        throw null;
    }

    boolean Uo(long j2) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean xMQ(long j2) {
        throw null;
    }

    private void J2(Context context) {
        if (this.f58890O == null) {
            this.f58890O = new n(context);
        }
    }

    private void az(TextView textView, long j2, int i2) {
        j jVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(t(textView.getContext(), j2));
        if (this.J2.J2().T(j2)) {
            textView.setEnabled(true);
            boolean zKN = KN(j2);
            textView.setSelected(zKN);
            jVar = zKN ? this.f58890O.rl : mUb(j2) ? this.f58890O.f58951t : this.f58890O.f58950n;
        } else {
            textView.setEnabled(false);
            jVar = this.f58890O.Uo;
        }
        jVar.rl(textView);
    }

    public void HI(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f58892t.iterator();
        while (it.hasNext()) {
            ty(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f58888o;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f58891n.J2;
    }

    int n(int i2) {
        return rl() + (i2 - 1);
    }

    int rl() {
        return this.f58891n.J2(this.J2.KN());
    }

    Dsr(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f58891n = month;
        this.J2 = calendarConstraints;
        this.f58892t = dateSelector.How();
    }

    private boolean mUb(long j2) {
        if (Xo.Uo().getTimeInMillis() == j2) {
            return true;
        }
        return false;
    }

    private String t(Context context, long j2) {
        return w6.n(context, j2, mUb(j2), xMQ(j2), Uo(j2));
    }

    private void ty(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.t(j2).equals(this.f58891n)) {
            int iKN = this.f58891n.KN(j2);
            az((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().n(iKN) - materialCalendarGridView.getFirstVisiblePosition()), j2, iKN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        J2(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Rxk.fuX.f8785Z, viewGroup, false);
        }
        int iRl = i2 - rl();
        if (iRl >= 0) {
            Month month = this.f58891n;
            if (iRl < month.f58930r) {
                i3 = iRl + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i3)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            } else {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i3 = -1;
            }
        }
        Long item = getItem(i2);
        if (item == null) {
            return textView;
        }
        az(textView, item.longValue(), i3);
        return textView;
    }

    boolean ck(int i2) {
        if (i2 >= rl() && i2 <= gh()) {
            return true;
        }
        return false;
    }

    int gh() {
        return (rl() + this.f58891n.f58930r) - 1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 >= rl() && i2 <= gh()) {
            return Long.valueOf(this.f58891n.Uo(qie(i2)));
        }
        return null;
    }

    int qie(int i2) {
        return (i2 - rl()) + 1;
    }
}
