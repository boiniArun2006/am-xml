package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected int[] f37337N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected int[] f37338T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    String[] f37339U;
    private CursorToStringConverter Xw;
    private ViewBinder jB;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f37340v;

    public interface CursorToStringConverter {
        CharSequence n(Cursor cursor);
    }

    public interface ViewBinder {
        boolean n(View view, Cursor cursor, int i2);
    }

    private void gh(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f37338T = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f37338T;
        if (iArr == null || iArr.length != length) {
            this.f37338T = new int[length];
        }
        for (int i2 = 0; i2 < length; i2++) {
            this.f37338T[i2] = cursor.getColumnIndexOrThrow(strArr[i2]);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void O(View view, Context context, Cursor cursor) {
        ViewBinder viewBinder = this.jB;
        int[] iArr = this.f37337N;
        int length = iArr.length;
        int[] iArr2 = this.f37338T;
        for (int i2 = 0; i2 < length; i2++) {
            View viewFindViewById = view.findViewById(iArr[i2]);
            if (viewFindViewById != null) {
                if (viewBinder != null ? viewBinder.n(viewFindViewById, cursor, iArr2[i2]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i2]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        az((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        qie((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor mUb(Cursor cursor) {
        gh(cursor, this.f37339U);
        return super.mUb(cursor);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence n(Cursor cursor) {
        CursorToStringConverter cursorToStringConverter = this.Xw;
        if (cursorToStringConverter != null) {
            return cursorToStringConverter.n(cursor);
        }
        int i2 = this.f37340v;
        return i2 > -1 ? cursor.getString(i2) : super.n(cursor);
    }

    public void az(TextView textView, String str) {
        textView.setText(str);
    }

    public void qie(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }
}
