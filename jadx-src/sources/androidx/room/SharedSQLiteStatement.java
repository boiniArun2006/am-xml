package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/sqlite/db/SupportSQLiteStatement;", "nr", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "", "canUseCached", "Uo", "(Z)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "O", "()Ljava/lang/String;", "", "t", "()V", "rl", "statement", "KN", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", c.f62177j, "Landroidx/room/RoomDatabase;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Lkotlin/Lazy;", "J2", "stmt", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final RoomDatabase database;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AtomicBoolean lock;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy stmt;

    protected abstract String O();

    public SharedSQLiteStatement(RoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt = LazyKt.lazy(new Function0() { // from class: androidx.room.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SharedSQLiteStatement.xMQ(this.f41526n);
            }
        });
    }

    private final SupportSQLiteStatement J2() {
        return (SupportSQLiteStatement) this.stmt.getValue();
    }

    private final SupportSQLiteStatement Uo(boolean canUseCached) {
        return canUseCached ? J2() : nr();
    }

    public void KN(SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == J2()) {
            this.lock.set(false);
        }
    }

    protected void t() {
        this.database.Uo();
    }

    private final SupportSQLiteStatement nr() {
        return this.database.gh(O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteStatement xMQ(SharedSQLiteStatement sharedSQLiteStatement) {
        return sharedSQLiteStatement.nr();
    }

    public SupportSQLiteStatement rl() {
        t();
        return Uo(this.lock.compareAndSet(false, true));
    }
}
