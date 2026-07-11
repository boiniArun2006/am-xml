package mg;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer rl(ContentResolver contentResolver, Uri uri) {
        Object objM313constructorimpl;
        Integer numValueOf;
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    numValueOf = cursorQuery.moveToFirst() ? Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("_size"))) : null;
                    CloseableKt.closeFinally(cursorQuery, null);
                } finally {
                }
            } else {
                numValueOf = null;
            }
            objM313constructorimpl = Result.m313constructorimpl(numValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
    }
}
