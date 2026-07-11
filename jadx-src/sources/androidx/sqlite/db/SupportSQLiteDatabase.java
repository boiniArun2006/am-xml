package androidx.sqlite.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u001fH&¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u001c\u0010+\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001c\u00103\u001a\u00020,8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010.\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0010R\u0014\u00106\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0010R\u0016\u00109\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0010R(\u0010@\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020=\u0018\u00010<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006CÀ\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "piY", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "az", "()V", "X", "ijL", "v", "E2", "", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "()Z", "eWT", "query", "Landroid/database/Cursor;", "Jk", "(Ljava/lang/String;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "P5", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "aYN", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "ck", "(Ljava/lang/String;)V", "", "", "bindArgs", "e", "(Ljava/lang/String;[Ljava/lang/Object;)V", "wTp", "isDbLockedByCurrentThread", "", "getVersion", "()I", "Y", "(I)V", NodeModuleProcess.PROPERTY_VERSION, "", "pJg", "()J", "maximumSize", "J2", "kSg", "(J)V", "pageSize", "eTf", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", JavetError.PARAMETER_PATH, "lLA", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "HI", "()Ljava/util/List;", "attachedDbs", "r", "isDatabaseIntegrityOk", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SupportSQLiteDatabase extends Closeable {
    void E2();

    List HI();

    long J2();

    Cursor Jk(String query);

    Cursor P5(SupportSQLiteQuery query);

    void X();

    void Y(int i2);

    Cursor aYN(SupportSQLiteQuery query, CancellationSignal cancellationSignal);

    void az();

    void ck(String sql);

    void e(String sql, Object[] bindArgs);

    boolean eTf();

    boolean eWT();

    String getPath();

    int getVersion();

    boolean i();

    boolean isOpen();

    void kSg(long j2);

    boolean lLA();

    long pJg();

    SupportSQLiteStatement piY(String sql);

    boolean r();

    void v();

    boolean wTp();

    default void ijL() {
        az();
    }
}
