package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class IE implements ViewBinding {
    public final TextView HI;
    public final TableRow J2;
    public final TableRow KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9150O;
    public final TextView Uo;
    public final TextView az;
    public final TextView gh;
    public final TableRow mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TableLayout f9151n;
    public final TableRow nr;
    public final TableRow qie;
    public final TableRow rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9152t;
    public final TableRow ty;
    public final TextView xMQ;

    public static IE t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static IE n(View view) {
        int i2 = 2131362546;
        TableRow tableRow = (TableRow) ViewBindings.n(view, 2131362546);
        if (tableRow != null) {
            i2 = 2131362547;
            TextView textView = (TextView) ViewBindings.n(view, 2131362547);
            if (textView != null) {
                i2 = 2131362585;
                TableRow tableRow2 = (TableRow) ViewBindings.n(view, 2131362585);
                if (tableRow2 != null) {
                    i2 = 2131362586;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131362586);
                    if (textView2 != null) {
                        i2 = 2131362831;
                        TableRow tableRow3 = (TableRow) ViewBindings.n(view, 2131362831);
                        if (tableRow3 != null) {
                            i2 = 2131362832;
                            TextView textView3 = (TextView) ViewBindings.n(view, 2131362832);
                            if (textView3 != null) {
                                i2 = 2131362845;
                                TableRow tableRow4 = (TableRow) ViewBindings.n(view, 2131362845);
                                if (tableRow4 != null) {
                                    i2 = 2131362848;
                                    TextView textView4 = (TextView) ViewBindings.n(view, 2131362848);
                                    if (textView4 != null) {
                                        i2 = 2131363257;
                                        TableRow tableRow5 = (TableRow) ViewBindings.n(view, 2131363257);
                                        if (tableRow5 != null) {
                                            i2 = 2131363259;
                                            TextView textView5 = (TextView) ViewBindings.n(view, 2131363259);
                                            if (textView5 != null) {
                                                i2 = 2131363576;
                                                TableRow tableRow6 = (TableRow) ViewBindings.n(view, 2131363576);
                                                if (tableRow6 != null) {
                                                    i2 = 2131363577;
                                                    TextView textView6 = (TextView) ViewBindings.n(view, 2131363577);
                                                    if (textView6 != null) {
                                                        i2 = 2131363698;
                                                        TableRow tableRow7 = (TableRow) ViewBindings.n(view, 2131363698);
                                                        if (tableRow7 != null) {
                                                            i2 = 2131363706;
                                                            TextView textView7 = (TextView) ViewBindings.n(view, 2131363706);
                                                            if (textView7 != null) {
                                                                return new IE((TableLayout) view, tableRow, textView, tableRow2, textView2, tableRow3, textView3, tableRow4, textView4, tableRow5, textView5, tableRow6, textView6, tableRow7, textView7);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public TableLayout getRoot() {
        return this.f9151n;
    }

    private IE(TableLayout tableLayout, TableRow tableRow, TextView textView, TableRow tableRow2, TextView textView2, TableRow tableRow3, TextView textView3, TableRow tableRow4, TextView textView4, TableRow tableRow5, TextView textView5, TableRow tableRow6, TextView textView6, TableRow tableRow7, TextView textView7) {
        this.f9151n = tableLayout;
        this.rl = tableRow;
        this.f9152t = textView;
        this.nr = tableRow2;
        this.f9150O = textView2;
        this.J2 = tableRow3;
        this.Uo = textView3;
        this.KN = tableRow4;
        this.xMQ = textView4;
        this.mUb = tableRow5;
        this.gh = textView5;
        this.qie = tableRow6;
        this.az = textView6;
        this.ty = tableRow7;
        this.HI = textView7;
    }

    public static IE nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558703, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
