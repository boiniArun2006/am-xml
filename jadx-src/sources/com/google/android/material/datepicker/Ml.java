package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class Ml extends BaseAdapter {
    private static final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f58923O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Calendar f58924n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f58925t;

    public Ml() {
        Calendar calendarXMQ = Xo.xMQ();
        this.f58924n = calendarXMQ;
        this.f58925t = calendarXMQ.getMaximum(7);
        this.f58923O = calendarXMQ.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Rxk.fuX.XQ, viewGroup, false);
        }
        this.f58924n.set(7, rl(i2));
        textView.setText(this.f58924n.getDisplayName(7, J2, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(Rxk.aC.Ik), this.f58924n.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    static {
        J2 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    private int rl(int i2) {
        int i3 = i2 + this.f58923O;
        int i5 = this.f58925t;
        return i3 > i5 ? i3 - i5 : i3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f58925t;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i2) {
        if (i2 >= this.f58925t) {
            return null;
        }
        return Integer.valueOf(rl(i2));
    }

    public Ml(int i2) {
        Calendar calendarXMQ = Xo.xMQ();
        this.f58924n = calendarXMQ;
        this.f58925t = calendarXMQ.getMaximum(7);
        this.f58923O = i2;
    }
}
