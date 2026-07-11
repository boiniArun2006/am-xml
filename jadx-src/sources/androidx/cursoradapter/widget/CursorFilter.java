package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class CursorFilter extends Filter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CursorFilterClient f37334n;

    interface CursorFilterClient {
        CharSequence n(Cursor cursor);

        Cursor nr();

        void rl(Cursor cursor);

        Cursor t(CharSequence charSequence);
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f37334n.n((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorT = this.f37334n.t(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorT != null) {
            filterResults.count = cursorT.getCount();
            filterResults.values = cursorT;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorNr = this.f37334n.nr();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorNr) {
            return;
        }
        this.f37334n.rl((Cursor) obj);
    }

    CursorFilter(CursorFilterClient cursorFilterClient) {
        this.f37334n = cursorFilterClient;
    }
}
