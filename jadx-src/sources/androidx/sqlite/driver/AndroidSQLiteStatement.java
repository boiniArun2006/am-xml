package androidx.sqlite.driver;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.driver.AndroidSQLiteStatement;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u001bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "sql", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "Z", "()V", c.f62177j, "Landroid/database/sqlite/SQLiteDatabase;", "()Landroid/database/sqlite/SQLiteDatabase;", "t", "Ljava/lang/String;", "rl", "()Ljava/lang/String;", "", "O", "isClosed", "()Z", "Uo", "(Z)V", "J2", "Companion", "SelectAndroidSQLiteStatement", "OtherAndroidSQLiteStatement", "Landroidx/sqlite/driver/AndroidSQLiteStatement$OtherAndroidSQLiteStatement;", "Landroidx/sqlite/driver/AndroidSQLiteStatement$SelectAndroidSQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidSQLiteStatement implements SQLiteStatement {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase db;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$Companion;", "", "<init>", "()V", "", "sql", "", "rl", "(Ljava/lang/String;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "db", "Landroidx/sqlite/driver/AndroidSQLiteStatement;", c.f62177j, "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Landroidx/sqlite/driver/AndroidSQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AndroidSQLiteStatement n(SQLiteDatabase db, String sql) {
            Intrinsics.checkNotNullParameter(db, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            return rl(sql) ? new SelectAndroidSQLiteStatement(db, sql) : new OtherAndroidSQLiteStatement(db, sql);
        }

        private final boolean rl(String sql) {
            String string = StringsKt.trim((CharSequence) sql).toString();
            if (string.length() < 3) {
                return false;
            }
            String strSubstring = string.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$OtherAndroidSQLiteStatement;", "Landroidx/sqlite/driver/AndroidSQLiteStatement;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "sql", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "index", "", "value", "", "mUb", "(IJ)V", "iF", "(ILjava/lang/String;)V", "gh", "(I)V", "getLong", "(I)J", "HV", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "RQ", "()Z", "reset", "()V", MRAIDPresenter.CLOSE, "Landroid/database/sqlite/SQLiteStatement;", "Landroidx/sqlite/driver/FrameworkStatement;", "r", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class OtherAndroidSQLiteStatement extends AndroidSQLiteStatement {

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final android.database.sqlite.SQLiteStatement delegate;

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherAndroidSQLiteStatement(SQLiteDatabase db, String sql) {
            super(db, sql, null);
            Intrinsics.checkNotNullParameter(db, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = db.compileStatement(sql);
            Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "compileStatement(...)");
            this.delegate = sQLiteStatementCompileStatement;
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            Uo(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void iF(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Z();
            this.delegate.bindString(index, value);
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
            this.delegate.bindNull(index);
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
            this.delegate.bindLong(index, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\b\u0002\u0018\u0000 G2\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u000fR\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$SelectAndroidSQLiteStatement;", "Landroidx/sqlite/driver/AndroidSQLiteStatement;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "sql", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "columnType", "index", "", "U", "(II)V", "M7", "()V", "Landroid/database/sqlite/SQLiteProgram;", "query", "jB", "(Landroid/database/sqlite/SQLiteProgram;)V", "Landroid/database/Cursor;", "M", "()Landroid/database/Cursor;", "c", "eF", "(Landroid/database/Cursor;I)V", "", "value", "mUb", "(IJ)V", "iF", "(ILjava/lang/String;)V", "gh", "(I)V", "getLong", "(I)J", "HV", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "RQ", "()Z", "reset", MRAIDPresenter.CLOSE, "", "r", "[I", "bindingTypes", "", "o", "[J", "longBindings", "", "Z", "[D", "doubleBindings", "", "S", "[Ljava/lang/String;", "stringBindings", "", "g", "[[B", "blobBindings", "E2", "Landroid/database/Cursor;", "cursor", "e", "Companion", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SelectAndroidSQLiteStatement extends AndroidSQLiteStatement {

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

        private final void U(int columnType, int index) {
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
        public SelectAndroidSQLiteStatement(SQLiteDatabase db, String sql) {
            super(db, sql, null);
            Intrinsics.checkNotNullParameter(db, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final Cursor M() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.rl(21, "no row");
            throw new KotlinNothingValueException();
        }

        private final void M7() {
            if (this.cursor == null) {
                this.cursor = getDb().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.driver.j
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return AndroidSQLiteStatement.SelectAndroidSQLiteStatement.p5(this.f42061n, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, getSql(), new String[0], null);
            }
        }

        private final void eF(Cursor c2, int index) {
            if (index < 0 || index >= c2.getColumnCount()) {
                SQLite.rl(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        private final void jB(SQLiteProgram query) {
            int length = this.bindingTypes.length;
            for (int i2 = 1; i2 < length; i2++) {
                int i3 = this.bindingTypes[i2];
                if (i3 == 1) {
                    query.bindLong(i2, this.longBindings[i2]);
                } else if (i3 == 2) {
                    query.bindDouble(i2, this.doubleBindings[i2]);
                } else if (i3 == 3) {
                    query.bindString(i2, this.stringBindings[i2]);
                } else if (i3 == 4) {
                    query.bindBlob(i2, this.blobBindings[i2]);
                } else if (i3 == 5) {
                    query.bindNull(i2);
                }
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void iF(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Z();
            U(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cursor p5(SelectAndroidSQLiteStatement selectAndroidSQLiteStatement, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            Intrinsics.checkNotNull(sQLiteQuery);
            selectAndroidSQLiteStatement.jB(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String HV(int index) {
            Z();
            Cursor cursorM = M();
            eF(cursorM, index);
            String string = cursorM.getString(index);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean RQ() {
            Z();
            M7();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                reset();
            }
            Uo(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            Z();
            M7();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int index) {
            Z();
            M7();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                eF(cursor, index);
                String columnName = cursor.getColumnName(index);
                Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
                return columnName;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            Z();
            Cursor cursorM = M();
            eF(cursorM, index);
            return cursorM.getLong(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void gh(int index) {
            Z();
            U(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            Z();
            Cursor cursorM = M();
            eF(cursorM, index);
            return cursorM.isNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void mUb(int index, long value) {
            Z();
            U(1, index);
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

    public /* synthetic */ AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDatabase, str);
    }

    private AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.db = sQLiteDatabase;
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
    protected final SQLiteDatabase getDb() {
        return this.db;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    protected final String getSql() {
        return this.sql;
    }
}
