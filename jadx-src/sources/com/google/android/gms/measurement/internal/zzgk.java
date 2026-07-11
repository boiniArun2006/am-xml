package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgk extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgi zzb;
    private boolean zzc;

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    @WorkerThread
    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6 A[Catch: all -> 0x0098, SQLiteException -> 0x009b, SQLiteDatabaseLockedException -> 0x00a2, SQLiteFullException -> 0x00a6, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163 A[PHI: r8 r10 r17
      0x0163: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzs(int i2, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzp;
        boolean z2;
        boolean z3;
        Cursor cursorRawQuery;
        zzg();
        boolean z4 = false;
        z4 = false;
        if (!this.zzc) {
            zzib zzibVar = this.zzu;
            zzal zzalVarZzc = zzibVar.zzc();
            zzfw zzfwVar = zzfx.zzbc;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarZzh = zzalVarZzc.zzp(null, zzfwVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i2));
            contentValues.put("entry", bArr);
            if (zzibVar.zzc().zzp(null, zzfwVar) && zzrVarZzh != null) {
                contentValues.put("app_version", zzrVarZzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzh.zzj));
            }
            zzibVar.zzc();
            int i3 = 0;
            int i5 = 5;
            for (int i7 = 5; i3 < i7; i7 = 5) {
                try {
                    sQLiteDatabaseZzp = zzp();
                } catch (SQLiteDatabaseLockedException unused) {
                    z2 = z4 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e2) {
                    e = e2;
                    z2 = z4 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e3) {
                    e = e3;
                    z2 = z4 ? 1 : 0;
                    z3 = true;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabaseZzp = null;
                }
                if (sQLiteDatabaseZzp == null) {
                    this.zzc = true;
                } else {
                    try {
                        sQLiteDatabaseZzp.beginTransaction();
                        cursorRawQuery = sQLiteDatabaseZzp.rawQuery("select count(1) from messages", null);
                        long j2 = 0;
                        if (cursorRawQuery == null) {
                            if (j2 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                            }
                            sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseZzp.setTransactionSuccessful();
                            sQLiteDatabaseZzp.endTransaction();
                            if (cursorRawQuery != null) {
                            }
                            sQLiteDatabaseZzp.close();
                            return z3;
                        }
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    j2 = cursorRawQuery.getLong(z4 ? 1 : 0);
                                }
                                if (j2 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                    zzibVar.zzaV().zzb().zza("Data loss, local db full");
                                    long j3 = 100001 - j2;
                                    long jDelete = sQLiteDatabaseZzp.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j3)});
                                    if (jDelete != j3) {
                                        zzgr zzgrVarZzb = zzibVar.zzaV().zzb();
                                        z2 = z4 ? 1 : 0;
                                        try {
                                            try {
                                                z3 = true;
                                            } catch (SQLiteDatabaseLockedException unused2) {
                                                SystemClock.sleep(i5);
                                                i5 += 20;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp == null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i3++;
                                                z4 = z2;
                                            }
                                            try {
                                                zzgrVarZzb.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j3), Long.valueOf(jDelete), Long.valueOf(j3 - jDelete));
                                            } catch (SQLiteFullException e4) {
                                                e = e4;
                                                this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                                this.zzc = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                }
                                                i3++;
                                                z4 = z2;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                if (sQLiteDatabaseZzp != null && sQLiteDatabaseZzp.inTransaction()) {
                                                    sQLiteDatabaseZzp.endTransaction();
                                                }
                                                this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                                this.zzc = z3;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                }
                                                i3++;
                                                z4 = z2;
                                            }
                                        } catch (SQLiteFullException e6) {
                                            e = e6;
                                            this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                            this.zzc = true;
                                            if (cursorRawQuery != null) {
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                            }
                                            i3++;
                                            z4 = z2;
                                        } catch (SQLiteException e7) {
                                            e = e7;
                                            z3 = true;
                                            if (sQLiteDatabaseZzp != null) {
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                            this.zzc = z3;
                                            if (cursorRawQuery != null) {
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                            }
                                            i3++;
                                            z4 = z2;
                                        }
                                    } else {
                                        z2 = z4 ? 1 : 0;
                                        z3 = true;
                                    }
                                }
                                sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                sQLiteDatabaseZzp.close();
                                return z3;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseZzp != null) {
                                    sQLiteDatabaseZzp.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z2 = z4 ? 1 : 0;
                            SystemClock.sleep(i5);
                            i5 += 20;
                            if (cursorRawQuery != null) {
                            }
                            if (sQLiteDatabaseZzp == null) {
                            }
                            i3++;
                            z4 = z2;
                        } catch (SQLiteFullException e8) {
                            e = e8;
                            z2 = z4 ? 1 : 0;
                            this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                            this.zzc = true;
                            if (cursorRawQuery != null) {
                            }
                            if (sQLiteDatabaseZzp != null) {
                            }
                            i3++;
                            z4 = z2;
                        } catch (SQLiteException e9) {
                            e = e9;
                            z2 = z4 ? 1 : 0;
                            z3 = true;
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.endTransaction();
                            }
                            this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                            this.zzc = z3;
                            if (cursorRawQuery != null) {
                            }
                            if (sQLiteDatabaseZzp != null) {
                            }
                            i3++;
                            z4 = z2;
                        }
                    } catch (SQLiteDatabaseLockedException unused4) {
                        z2 = z4 ? 1 : 0;
                        cursorRawQuery = null;
                    } catch (SQLiteFullException e10) {
                        e = e10;
                        z2 = z4 ? 1 : 0;
                        cursorRawQuery = null;
                    } catch (SQLiteException e11) {
                        e = e11;
                        z2 = z4 ? 1 : 0;
                        z3 = true;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    i3++;
                    z4 = z2;
                }
            }
            boolean z5 = z4 ? 1 : 0;
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return z5;
        }
        return z4;
    }

    public final boolean zzk(zzah zzahVar) {
        zzib zzibVar = this.zzu;
        byte[] bArrZzae = zzibVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzibVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzib zzibVar = this.zzu;
        byte[] bArrZzae = zzibVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzibVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzibVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x036a A[PHI: r6 r11 r13 r17 r19 r21
      0x036a: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:189:0x0351, B:204:0x038d, B:197:0x0368] A[DONT_GENERATE, DONT_INLINE]
      0x036a: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:189:0x0351, B:204:0x038d, B:197:0x0368] A[DONT_GENERATE, DONT_INLINE]
      0x036a: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:189:0x0351, B:204:0x038d, B:197:0x0368] A[DONT_GENERATE, DONT_INLINE]
      0x036a: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:189:0x0351, B:204:0x038d, B:197:0x0368] A[DONT_GENERATE, DONT_INLINE]
      0x036a: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:189:0x0351, B:204:0x038d, B:197:0x0368] A[DONT_GENERATE, DONT_INLINE]
      0x036a: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:189:0x0351, B:204:0x038d, B:197:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0333 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzal] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzm(int i2) {
        Cursor cursor;
        ?? r13;
        String str;
        String str2;
        String str3;
        int i3;
        ?? Zzp;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j2;
        long j3;
        ?? r17;
        ?? r16;
        int i5;
        zzfw zzfwVar;
        int i7;
        int i8;
        int i9;
        zzib zzibVar;
        long j4;
        String string;
        zzib zzibVar2;
        zzbg zzbgVarCreateFromParcel;
        int i10;
        int i11;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpk zzpkVarCreateFromParcel;
        String str4 = FijIa.jMWm;
        String str5 = "type";
        String str6 = "rowid";
        zzg();
        ?? r6 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i12 = 0;
        int i13 = 5;
        int i14 = 0;
        for (int i15 = 5; i14 < i15; i15 = 5) {
            try {
                Zzp = zzp();
                try {
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    r13 = Zzp;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused) {
                str = str4;
                str2 = str5;
                str3 = str6;
                i3 = i12;
                Zzp = 0;
            } catch (SQLiteFullException e2) {
                e = e2;
                str = str4;
                str2 = str5;
                str3 = str6;
                i3 = i12;
                Zzp = 0;
            } catch (SQLiteException e3) {
                e = e3;
                str = str4;
                str2 = str5;
                str3 = str6;
                i3 = i12;
                Zzp = 0;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                r13 = 0;
            }
            if (Zzp == 0) {
                this.zzc = true;
                return r6;
            }
            try {
                Zzp.beginTransaction();
                try {
                    cursorQuery2 = Zzp.query("messages", new String[]{str6}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                    try {
                        j2 = -1;
                        if (cursorQuery2.moveToFirst()) {
                            j3 = cursorQuery2.getLong(i12);
                            cursorQuery2.close();
                        } else {
                            cursorQuery2.close();
                            j3 = -1;
                        }
                        if (j3 != -1) {
                            String[] strArr = new String[1];
                            strArr[i12] = String.valueOf(j3);
                            r16 = "rowid<?";
                            r17 = strArr;
                        } else {
                            ?? r162 = r6;
                            r17 = r162;
                            r16 = r162;
                        }
                        String[] strArr2 = {str6, str5, str4};
                        zzib zzibVar3 = this.zzu;
                        ?? Zzc = zzibVar3.zzc();
                        i5 = 1;
                        zzfwVar = zzfx.zzbc;
                        boolean zZzp = Zzc.zzp(r6, zzfwVar);
                        i7 = 4;
                        i8 = 3;
                        i9 = 2;
                        if (zZzp) {
                            strArr2 = new String[i15];
                            strArr2[i12] = str6;
                            strArr2[1] = str5;
                            strArr2[2] = str4;
                            strArr2[3] = "app_version";
                            strArr2[4] = "app_version_int";
                        }
                        String[] strArr3 = strArr2;
                        zzibVar = zzibVar3;
                        cursorQuery = Zzp.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                    } catch (Throwable th3) {
                        th = th3;
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                        i3 = i12;
                        if (cursorQuery2 != null) {
                            try {
                                cursorQuery2.close();
                            } catch (SQLiteDatabaseLockedException unused2) {
                                cursorQuery = null;
                                SystemClock.sleep(i13);
                                i13 += 20;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (Zzp == 0) {
                                    Zzp.close();
                                }
                                i14++;
                                i12 = i3;
                                str4 = str;
                                str5 = str2;
                                str6 = str3;
                                r6 = 0;
                            } catch (SQLiteFullException e4) {
                                e = e4;
                                Zzp = Zzp;
                                cursorQuery = null;
                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                this.zzc = true;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (Zzp == 0) {
                                }
                                i14++;
                                i12 = i3;
                                str4 = str;
                                str5 = str2;
                                str6 = str3;
                                r6 = 0;
                            } catch (SQLiteException e5) {
                                e = e5;
                                Zzp = Zzp;
                                cursorQuery = null;
                                if (Zzp != 0) {
                                    try {
                                        if (Zzp.inTransaction()) {
                                            Zzp.endTransaction();
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor = cursorQuery;
                                        r13 = Zzp;
                                        if (cursor != null) {
                                        }
                                        if (r13 != 0) {
                                        }
                                        throw th;
                                    }
                                }
                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                this.zzc = true;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (Zzp == 0) {
                                }
                                i14++;
                                i12 = i3;
                                str4 = str;
                                str5 = str2;
                                str6 = str3;
                                r6 = 0;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    i3 = i12;
                    cursorQuery2 = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                str = str4;
                str2 = str5;
                str3 = str6;
                i3 = i12;
            } catch (SQLiteFullException e6) {
                e = e6;
                str = str4;
                str2 = str5;
                str3 = str6;
                i3 = i12;
                Zzp = Zzp;
            } catch (SQLiteException e7) {
                e = e7;
                str = str4;
                str2 = str5;
                str3 = str6;
                i3 = i12;
                Zzp = Zzp;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    j2 = cursorQuery.getLong(i12);
                    int i16 = cursorQuery.getInt(i5);
                    byte[] blob = cursorQuery.getBlob(i9);
                    try {
                        if (zzibVar.zzc().zzp(null, zzfwVar)) {
                            string = cursorQuery.getString(i8);
                            j4 = cursorQuery.getLong(i7);
                        } else {
                            j4 = 0;
                            string = null;
                        }
                        String str7 = str4;
                        long j5 = j4;
                        str2 = str5;
                        if (i16 == 0) {
                            try {
                                Parcel parcelObtain = Parcel.obtain();
                                zzibVar2 = zzibVar;
                                try {
                                    str3 = str6;
                                    try {
                                        try {
                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                            parcelObtain.setDataPosition(0);
                                            zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            throw th;
                                        }
                                    } catch (SafeParcelReader.ParseException unused4) {
                                        this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                        parcelObtain.recycle();
                                    }
                                } catch (SafeParcelReader.ParseException unused5) {
                                    str3 = str6;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                                try {
                                    if (zzbgVarCreateFromParcel != null) {
                                        arrayList.add(new zzgj(zzbgVarCreateFromParcel, string, j5));
                                    }
                                    str = str7;
                                    i11 = 2;
                                    i10 = 3;
                                    i3 = 0;
                                    i8 = i10;
                                    i12 = i3;
                                    str4 = str;
                                    str5 = str2;
                                    str6 = str3;
                                    i5 = 1;
                                    i7 = 4;
                                    i9 = i11;
                                    zzibVar = zzibVar2;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    str = str7;
                                    i3 = 0;
                                    SystemClock.sleep(i13);
                                    i13 += 20;
                                    if (cursorQuery != null) {
                                    }
                                    if (Zzp == 0) {
                                    }
                                    i14++;
                                    i12 = i3;
                                    str4 = str;
                                    str5 = str2;
                                    str6 = str3;
                                    r6 = 0;
                                } catch (SQLiteFullException e8) {
                                    e = e8;
                                    str = str7;
                                    i3 = 0;
                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                    this.zzc = true;
                                    if (cursorQuery != null) {
                                    }
                                    if (Zzp == 0) {
                                    }
                                    i14++;
                                    i12 = i3;
                                    str4 = str;
                                    str5 = str2;
                                    str6 = str3;
                                    r6 = 0;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    str = str7;
                                    i3 = 0;
                                    if (Zzp != 0) {
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                    this.zzc = true;
                                    if (cursorQuery != null) {
                                    }
                                    if (Zzp == 0) {
                                    }
                                    i14++;
                                    i12 = i3;
                                    str4 = str;
                                    str5 = str2;
                                    str6 = str3;
                                    r6 = 0;
                                }
                            } catch (SQLiteDatabaseLockedException unused7) {
                                str3 = str6;
                            } catch (SQLiteFullException e10) {
                                e = e10;
                                str3 = str6;
                            } catch (SQLiteException e11) {
                                e = e11;
                                str3 = str6;
                            }
                        } else {
                            zzibVar2 = zzibVar;
                            str3 = str6;
                            if (i16 == 1) {
                                Parcel parcelObtain2 = Parcel.obtain();
                                try {
                                    try {
                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                        parcelObtain2.setDataPosition(0);
                                        zzpkVarCreateFromParcel = zzpk.CREATOR.createFromParcel(parcelObtain2);
                                    } finally {
                                        parcelObtain2.recycle();
                                    }
                                } catch (SafeParcelReader.ParseException unused8) {
                                    this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                    parcelObtain2.recycle();
                                    zzpkVarCreateFromParcel = null;
                                }
                                if (zzpkVarCreateFromParcel != null) {
                                    arrayList.add(new zzgj(zzpkVarCreateFromParcel, string, j5));
                                }
                                str = str7;
                                i11 = 2;
                                i10 = 3;
                                i3 = 0;
                                i8 = i10;
                                i12 = i3;
                                str4 = str;
                                str5 = str2;
                                str6 = str3;
                                i5 = 1;
                                i7 = 4;
                                i9 = i11;
                                zzibVar = zzibVar2;
                            } else {
                                i11 = 2;
                                if (i16 == 2) {
                                    Parcel parcelObtain3 = Parcel.obtain();
                                    try {
                                        str = str7;
                                        try {
                                            try {
                                                parcelObtain3.unmarshall(blob, 0, blob.length);
                                                parcelObtain3.setDataPosition(0);
                                                zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                            } catch (SafeParcelReader.ParseException unused9) {
                                                this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                parcelObtain3.recycle();
                                                zzahVarCreateFromParcel = null;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            throw th;
                                        }
                                    } catch (SafeParcelReader.ParseException unused10) {
                                        str = str7;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        str = str7;
                                    }
                                    try {
                                        if (zzahVarCreateFromParcel != null) {
                                            arrayList.add(new zzgj(zzahVarCreateFromParcel, string, j5));
                                        }
                                        i10 = 3;
                                        i3 = 0;
                                        i8 = i10;
                                        i12 = i3;
                                        str4 = str;
                                        str5 = str2;
                                        str6 = str3;
                                        i5 = 1;
                                        i7 = 4;
                                        i9 = i11;
                                        zzibVar = zzibVar2;
                                    } catch (SQLiteDatabaseLockedException unused11) {
                                        i3 = 0;
                                        SystemClock.sleep(i13);
                                        i13 += 20;
                                        if (cursorQuery != null) {
                                        }
                                        if (Zzp == 0) {
                                        }
                                        i14++;
                                        i12 = i3;
                                        str4 = str;
                                        str5 = str2;
                                        str6 = str3;
                                        r6 = 0;
                                    } catch (SQLiteFullException e12) {
                                        e = e12;
                                        i3 = 0;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                        }
                                        if (Zzp == 0) {
                                        }
                                        i14++;
                                        i12 = i3;
                                        str4 = str;
                                        str5 = str2;
                                        str6 = str3;
                                        r6 = 0;
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        i3 = 0;
                                        if (Zzp != 0) {
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                        }
                                        if (Zzp == 0) {
                                        }
                                        i14++;
                                        i12 = i3;
                                        str4 = str;
                                        str5 = str2;
                                        str6 = str3;
                                        r6 = 0;
                                    }
                                } else {
                                    str = str7;
                                    if (i16 == 4) {
                                        Parcel parcelObtain4 = Parcel.obtain();
                                        try {
                                            i3 = 0;
                                            try {
                                                try {
                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                    parcelObtain4.setDataPosition(0);
                                                    zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                } catch (SafeParcelReader.ParseException unused12) {
                                                    this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                    parcelObtain4.recycle();
                                                    zzbeVarCreateFromParcel = null;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                throw th;
                                            }
                                        } catch (SafeParcelReader.ParseException unused13) {
                                            i3 = 0;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                        try {
                                            if (zzbeVarCreateFromParcel != null) {
                                                arrayList.add(new zzgj(zzbeVarCreateFromParcel, string, j5));
                                            }
                                            i10 = 3;
                                        } catch (SQLiteDatabaseLockedException unused14) {
                                            SystemClock.sleep(i13);
                                            i13 += 20;
                                            if (cursorQuery != null) {
                                            }
                                            if (Zzp == 0) {
                                            }
                                            i14++;
                                            i12 = i3;
                                            str4 = str;
                                            str5 = str2;
                                            str6 = str3;
                                            r6 = 0;
                                        } catch (SQLiteFullException e14) {
                                            e = e14;
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursorQuery != null) {
                                            }
                                            if (Zzp == 0) {
                                            }
                                            i14++;
                                            i12 = i3;
                                            str4 = str;
                                            str5 = str2;
                                            str6 = str3;
                                            r6 = 0;
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            if (Zzp != 0) {
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursorQuery != null) {
                                            }
                                            if (Zzp == 0) {
                                            }
                                            i14++;
                                            i12 = i3;
                                            str4 = str;
                                            str5 = str2;
                                            str6 = str3;
                                            r6 = 0;
                                        }
                                    } else {
                                        i10 = 3;
                                        i3 = 0;
                                        if (i16 == 3) {
                                            this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                        } else {
                                            this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                        }
                                    }
                                    i8 = i10;
                                    i12 = i3;
                                    str4 = str;
                                    str5 = str2;
                                    str6 = str3;
                                    i5 = 1;
                                    i7 = 4;
                                    i9 = i11;
                                    zzibVar = zzibVar2;
                                }
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                    } catch (SQLiteFullException e16) {
                        e = e16;
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                    } catch (SQLiteException e17) {
                        e = e17;
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                    }
                } catch (SQLiteDatabaseLockedException unused16) {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    i3 = i12;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    i3 = i12;
                } catch (SQLiteException e19) {
                    e = e19;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    i3 = i12;
                }
                i14++;
                i12 = i3;
                str4 = str;
                str5 = str2;
                str6 = str3;
                r6 = 0;
            }
            if (Zzp.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
            }
            Zzp.setTransactionSuccessful();
            Zzp.endTransaction();
            cursorQuery.close();
            Zzp.close();
            return arrayList;
        }
        this.zzu.zzaV().zze().zza("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[PHI: r4
      0x006b: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:34:0x007e, B:31:0x0069, B:28:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i2 = 5;
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    this.zzu.zzaV().zze().zza("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzp = zzp();
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.beginTransaction();
                                sQLiteDatabaseZzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                sQLiteDatabaseZzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteException e2) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e2);
                            this.zzc = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                                i3++;
                            } else {
                                i3++;
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i2);
                        i2 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        i3++;
                    }
                } catch (SQLiteFullException e3) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e3);
                    this.zzc = true;
                    if (0 != 0) {
                    }
                    i3++;
                }
                i3++;
            }
        }
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    @VisibleForTesting
    final boolean zzq() {
        zzib zzibVar = this.zzu;
        Context contextZzaY = zzibVar.zzaY();
        zzibVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }

    zzgk(zzib zzibVar) {
        super(zzibVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgi(this, contextZzaY, "google_app_measurement_local.db");
    }

    @WorkerThread
    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp != null && (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) > 0) {
                this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzs(0, bArrMarshall);
    }

    public final boolean zzj(zzpk zzpkVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpl.zza(zzpkVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzs(1, bArrMarshall);
    }
}
