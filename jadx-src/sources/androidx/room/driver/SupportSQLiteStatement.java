package androidx.room.driver;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u001bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Landroidx/room/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "sql", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "", "Z", "()V", c.f62177j, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "t", "Ljava/lang/String;", "rl", "()Ljava/lang/String;", "", "O", "isClosed", "()Z", "Uo", "(Z)V", "J2", "Companion", "SupportAndroidSQLiteStatement", "SupportOtherAndroidSQLiteStatement", "Landroidx/room/driver/SupportSQLiteStatement$SupportAndroidSQLiteStatement;", "Landroidx/room/driver/SupportSQLiteStatement$SupportOtherAndroidSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public abstract class SupportSQLiteStatement implements SQLiteStatement {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SupportSQLiteDatabase db;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/driver/SupportSQLiteStatement$Companion;", "", "<init>", "()V", "", "prefix", "", "nr", "(Ljava/lang/String;)Z", CmcdData.STREAMING_FORMAT_SS, "", "t", "(Ljava/lang/String;)I", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "sql", "Landroidx/room/driver/SupportSQLiteStatement;", c.f62177j, "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/driver/SupportSQLiteStatement;", "rl", "(Ljava/lang/String;)Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SupportSQLiteStatement n(SupportSQLiteDatabase db, String sql) {
            Intrinsics.checkNotNullParameter(db, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            String upperCase = StringsKt.trim((CharSequence) sql).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strRl = rl(upperCase);
            return strRl == null ? new SupportOtherAndroidSQLiteStatement(db, sql) : nr(strRl) ? new SupportAndroidSQLiteStatement(db, sql) : new SupportOtherAndroidSQLiteStatement(db, sql);
        }

        public final String rl(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            int iT = t(sql);
            if (iT < 0 || iT > sql.length()) {
                return null;
            }
            String strSubstring = sql.substring(iT, Math.min(iT + 3, sql.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }

        private final boolean nr(String prefix) {
            int iHashCode = prefix.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && prefix.equals("WIT")) {
                        return true;
                    }
                    return false;
                }
                if (prefix.equals("SEL")) {
                    return true;
                }
                return false;
            }
            if (prefix.equals("PRA")) {
                return true;
            }
            return false;
        }

        private final int t(String s2) {
            String str;
            int i2;
            int length = s2.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i3 = 0;
            while (i3 < length) {
                char cCharAt = s2.charAt(i3);
                if (Intrinsics.compare((int) cCharAt, 32) <= 0) {
                    i3++;
                } else if (cCharAt == '-') {
                    if (s2.charAt(i3 + 1) == '-') {
                        str = s2;
                        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '\n', i3 + 2, false, 4, (Object) null);
                        if (iIndexOf$default < 0) {
                            return -1;
                        }
                        i3 = iIndexOf$default + 1;
                        s2 = str;
                    } else {
                        return i3;
                    }
                } else {
                    str = s2;
                    if (cCharAt == '/') {
                        int iIndexOf$default2 = i3 + 1;
                        if (str.charAt(iIndexOf$default2) == '*') {
                            do {
                                String str2 = str;
                                iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '*', iIndexOf$default2 + 1, false, 4, (Object) null);
                                str = str2;
                                if (iIndexOf$default2 < 0) {
                                    return -1;
                                }
                                i2 = iIndexOf$default2 + 1;
                                if (i2 >= length) {
                                    break;
                                }
                            } while (str.charAt(i2) != '/');
                            i3 = iIndexOf$default2 + 2;
                            s2 = str;
                        }
                    }
                    return i3;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\b\u0002\u0018\u0000 D2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\u000fJ\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u000fJ\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u000fR\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Landroidx/room/driver/SupportSQLiteStatement$SupportAndroidSQLiteStatement;", "Landroidx/room/driver/SupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "sql", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "", "columnType", "index", "", "M", "(II)V", "FX", "()V", "Landroid/database/Cursor;", "z", "()Landroid/database/Cursor;", "c", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/database/Cursor;I)V", "", "value", "mUb", "(IJ)V", "iF", "(ILjava/lang/String;)V", "gh", "(I)V", "getLong", "(I)J", "HV", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "RQ", "()Z", "reset", "eF", MRAIDPresenter.CLOSE, "", "r", "[I", "bindingTypes", "", "o", "[J", "longBindings", "", "Z", "[D", "doubleBindings", "", "S", "[Ljava/lang/String;", "stringBindings", "", "g", "[[B", "blobBindings", "E2", "Landroid/database/Cursor;", "cursor", "e", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SupportAndroidSQLiteStatement extends SupportSQLiteStatement {

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private Cursor cursor;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes;

        private final void M(int columnType, int index) {
            int i2 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i2) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i2) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
                    Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i2) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i2);
                    Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i2) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i2) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i2);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportAndroidSQLiteStatement(SupportSQLiteDatabase db, String sql) {
            super(db, sql, null);
            Intrinsics.checkNotNullParameter(db, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void FX() {
            if (this.cursor == null) {
                this.cursor = getDb().P5(new SupportSQLiteQuery() { // from class: androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$ensureCursor$1
                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    /* JADX INFO: renamed from: n */
                    public String getQuery() {
                        return this.f41660n.getSql();
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public void rl(SupportSQLiteProgram statement) {
                        Intrinsics.checkNotNullParameter(statement, "statement");
                        int length = this.f41660n.bindingTypes.length;
                        for (int i2 = 1; i2 < length; i2++) {
                            int i3 = this.f41660n.bindingTypes[i2];
                            if (i3 == 1) {
                                statement.mUb(i2, this.f41660n.longBindings[i2]);
                            } else if (i3 == 2) {
                                statement.WPU(i2, this.f41660n.doubleBindings[i2]);
                            } else if (i3 == 3) {
                                String str = this.f41660n.stringBindings[i2];
                                Intrinsics.checkNotNull(str);
                                statement.k(i2, str);
                            } else if (i3 == 4) {
                                byte[] bArr = this.f41660n.blobBindings[i2];
                                Intrinsics.checkNotNull(bArr);
                                statement.C(i2, bArr);
                            } else if (i3 == 5) {
                                statement.gh(i2);
                            }
                        }
                    }
                });
            }
        }

        private final void a(Cursor c2, int index) {
            if (index < 0 || index >= c2.getColumnCount()) {
                SQLite.rl(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        private final Cursor z() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.rl(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void iF(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Z();
            M(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String HV(int index) {
            Z();
            Cursor cursorZ = z();
            a(cursorZ, index);
            String string = cursorZ.getString(index);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean RQ() {
            Z();
            FX();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                eF();
                reset();
            }
            Uo(true);
        }

        public void eF() {
            Z();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            Z();
            FX();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int index) {
            Z();
            FX();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                a(cursor, index);
                String columnName = cursor.getColumnName(index);
                Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
                return columnName;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            Z();
            Cursor cursorZ = z();
            a(cursorZ, index);
            return cursorZ.getLong(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void gh(int index) {
            Z();
            M(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            Z();
            Cursor cursorZ = z();
            a(cursorZ, index);
            return cursorZ.isNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void mUb(int index, long value) {
            Z();
            M(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            Z();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/room/driver/SupportSQLiteStatement$SupportOtherAndroidSQLiteStatement;", "Landroidx/room/driver/SupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "sql", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "", "index", "", "value", "", "mUb", "(IJ)V", "iF", "(ILjava/lang/String;)V", "gh", "(I)V", "getLong", "(I)J", "HV", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "RQ", "()Z", "reset", "()V", MRAIDPresenter.CLOSE, "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroidx/room/driver/SupportStatement;", "r", "Landroidx/sqlite/db/SupportSQLiteStatement;", "delegate", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SupportOtherAndroidSQLiteStatement extends SupportSQLiteStatement {

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final androidx.sqlite.db.SupportSQLiteStatement delegate;

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportOtherAndroidSQLiteStatement(SupportSQLiteDatabase db, String sql) {
            super(db, sql, null);
            Intrinsics.checkNotNullParameter(db, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.delegate = db.piY(sql);
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            Uo(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void iF(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Z();
            this.delegate.k(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String HV(int index) {
            Z();
            SQLite.rl(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean RQ() {
            Z();
            this.delegate.execute();
            return false;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            Z();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int index) {
            Z();
            SQLite.rl(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            Z();
            SQLite.rl(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void gh(int index) {
            Z();
            this.delegate.gh(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            Z();
            SQLite.rl(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void mUb(int index, long value) {
            Z();
            this.delegate.mUb(index, value);
        }
    }

    public /* synthetic */ SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportSQLiteDatabase, str);
    }

    private SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.db = supportSQLiteDatabase;
        this.sql = str;
    }

    protected final void Uo(boolean z2) {
        this.isClosed = z2;
    }

    protected final void Z() {
        if (this.isClosed) {
            SQLite.rl(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    protected final SupportSQLiteDatabase getDb() {
        return this.db;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    protected final String getSql() {
        return this.sql;
    }
}
