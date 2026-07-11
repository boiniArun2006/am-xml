package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f58455t = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DatabaseProvider f58456n;
    private String rl;

    private static String O(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    private Cursor nr() {
        Assertions.checkNotNull(this.rl);
        return this.f58456n.getReadableDatabase().query(this.rl, f58455t, null, null, null, null, null);
    }

    private static void rl(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public void KN(Set set) throws DatabaseIOException {
        Assertions.checkNotNull(this.rl);
        try {
            SQLiteDatabase writableDatabase = this.f58456n.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.rl, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void Uo(String str) throws DatabaseIOException {
        Assertions.checkNotNull(this.rl);
        try {
            this.f58456n.getWritableDatabase().delete(this.rl, "name = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void xMQ(String str, long j2, long j3) throws DatabaseIOException {
        Assertions.checkNotNull(this.rl);
        try {
            SQLiteDatabase writableDatabase = this.f58456n.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j2));
            contentValues.put("last_touch_timestamp", Long.valueOf(j3));
            writableDatabase.replaceOrThrow(this.rl, null, contentValues);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public n(DatabaseProvider databaseProvider) {
        this.f58456n = databaseProvider;
    }

    public static void n(DatabaseProvider databaseProvider, long j2) throws DatabaseIOException {
        String hexString = Long.toHexString(j2);
        try {
            String strO = O(hexString);
            SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                VersionTable.removeVersion(writableDatabase, 2, hexString);
                rl(writableDatabase, strO);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void J2(long j2) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j2);
            this.rl = O(hexString);
            if (VersionTable.getVersion(this.f58456n.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f58456n.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.setVersion(writableDatabase, 2, hexString, 1);
                    rl(writableDatabase, this.rl);
                    writableDatabase.execSQL("CREATE TABLE " + this.rl + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public Map t() throws DatabaseIOException {
        try {
            Cursor cursorNr = nr();
            try {
                HashMap map = new HashMap(cursorNr.getCount());
                while (cursorNr.moveToNext()) {
                    map.put((String) Assertions.checkNotNull(cursorNr.getString(0)), new j(cursorNr.getLong(1), cursorNr.getLong(2)));
                }
                cursorNr.close();
                return map;
            } finally {
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
