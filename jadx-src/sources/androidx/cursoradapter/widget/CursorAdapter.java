package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.cursoradapter.widget.CursorFilter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    protected Context J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected Cursor f37324O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected CursorFilter f37325S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected DataSetObserver f37326Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FilterQueryProvider f37327g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f37328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ChangeObserver f37329o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f37330r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f37331t;

    private class ChangeObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        ChangeObserver() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            CursorAdapter.this.xMQ();
        }
    }

    private class MyDataSetObserver extends DataSetObserver {
        MyDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f37328n = true;
            cursorAdapter.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f37328n = false;
            cursorAdapter.notifyDataSetInvalidated();
        }
    }

    public abstract View KN(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void O(View view, Context context, Cursor cursor);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    void J2(Context context, Cursor cursor, int i2) {
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f37331t = true;
        } else {
            this.f37331t = false;
        }
        boolean z2 = cursor != null;
        this.f37324O = cursor;
        this.f37328n = z2;
        this.J2 = context;
        this.f37330r = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f37329o = new ChangeObserver();
            this.f37326Z = new MyDataSetObserver();
        } else {
            this.f37329o = null;
            this.f37326Z = null;
        }
        if (z2) {
            ChangeObserver changeObserver = this.f37329o;
            if (changeObserver != null) {
                cursor.registerContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.f37326Z;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f37328n || (cursor = this.f37324O) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f37328n) {
            return null;
        }
        this.f37324O.moveToPosition(i2);
        if (view == null) {
            view = Uo(this.J2, this.f37324O, viewGroup);
        }
        O(view, this.J2, this.f37324O);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f37325S == null) {
            this.f37325S = new CursorFilter(this);
        }
        return this.f37325S;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f37328n || (cursor = this.f37324O) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f37324O;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f37328n && (cursor = this.f37324O) != null && cursor.moveToPosition(i2)) {
            return this.f37324O.getLong(this.f37330r);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f37328n) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f37324O.moveToPosition(i2)) {
            if (view == null) {
                view = KN(this.J2, this.f37324O, viewGroup);
            }
            O(view, this.J2, this.f37324O);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    public Cursor mUb(Cursor cursor) {
        Cursor cursor2 = this.f37324O;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ChangeObserver changeObserver = this.f37329o;
            if (changeObserver != null) {
                cursor2.unregisterContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.f37326Z;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f37324O = cursor;
        if (cursor == null) {
            this.f37330r = -1;
            this.f37328n = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        ChangeObserver changeObserver2 = this.f37329o;
        if (changeObserver2 != null) {
            cursor.registerContentObserver(changeObserver2);
        }
        DataSetObserver dataSetObserver2 = this.f37326Z;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f37330r = cursor.getColumnIndexOrThrow("_id");
        this.f37328n = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public CharSequence n(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public Cursor nr() {
        return this.f37324O;
    }

    public Cursor t(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f37327g;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f37324O;
    }

    protected void xMQ() {
        Cursor cursor;
        if (!this.f37331t || (cursor = this.f37324O) == null || cursor.isClosed()) {
            return;
        }
        this.f37328n = this.f37324O.requery();
    }

    public CursorAdapter(Context context, Cursor cursor, boolean z2) {
        int i2;
        if (z2) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        J2(context, cursor, i2);
    }

    public View Uo(Context context, Cursor cursor, ViewGroup viewGroup) {
        return KN(context, cursor, viewGroup);
    }

    public void rl(Cursor cursor) {
        Cursor cursorMUb = mUb(cursor);
        if (cursorMUb != null) {
            cursorMUb.close();
        }
    }
}
