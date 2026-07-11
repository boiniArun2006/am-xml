package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {
    private int E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private LayoutInflater f37335X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37336e;

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View KN(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f37335X.inflate(this.E2, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View Uo(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f37335X.inflate(this.f37336e, viewGroup, false);
    }

    public ResourceCursorAdapter(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.f37336e = i2;
        this.E2 = i2;
        this.f37335X = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
