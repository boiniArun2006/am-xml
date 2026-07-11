package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class PreferenceViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f40643O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f40644n;
    private boolean nr;
    private ColorStateList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SparseArray f40645t;

    public boolean J2() {
        return this.f40643O;
    }

    public void KN(boolean z2) {
        this.nr = z2;
    }

    public boolean O() {
        return this.nr;
    }

    void Uo() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f40644n;
        if (background != drawable) {
            ViewCompat.C(this.itemView, drawable);
        }
        TextView textView = (TextView) nr(android.R.id.title);
        if (textView == null || this.rl == null || textView.getTextColors().equals(this.rl)) {
            return;
        }
        textView.setTextColor(this.rl);
    }

    public View nr(int i2) {
        View view = (View) this.f40645t.get(i2);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i2);
        if (viewFindViewById != null) {
            this.f40645t.put(i2, viewFindViewById);
        }
        return viewFindViewById;
    }

    public void xMQ(boolean z2) {
        this.f40643O = z2;
    }

    PreferenceViewHolder(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f40645t = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        int i2 = R.id.f40652n;
        sparseArray.put(i2, view.findViewById(i2));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.f40644n = view.getBackground();
        if (textView != null) {
            this.rl = textView.getTextColors();
        }
    }
}
