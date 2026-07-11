package androidx.room;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0010JM\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/room/Transactor;", "Landroidx/room/PooledConnection;", "R", "Landroidx/room/Transactor$SQLiteTransactionType;", "type", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", c.f62177j, "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "rl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SQLiteTransactionType", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Transactor extends PooledConnection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/Transactor$SQLiteTransactionType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SQLiteTransactionType {
        private static final /* synthetic */ SQLiteTransactionType[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f41455r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final SQLiteTransactionType f41454n = new SQLiteTransactionType("DEFERRED", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final SQLiteTransactionType f41456t = new SQLiteTransactionType("IMMEDIATE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final SQLiteTransactionType f41453O = new SQLiteTransactionType("EXCLUSIVE", 2);

        private static final /* synthetic */ SQLiteTransactionType[] n() {
            return new SQLiteTransactionType[]{f41454n, f41456t, f41453O};
        }

        static {
            SQLiteTransactionType[] sQLiteTransactionTypeArrN = n();
            J2 = sQLiteTransactionTypeArrN;
            f41455r = EnumEntriesKt.enumEntries(sQLiteTransactionTypeArrN);
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) J2.clone();
        }

        private SQLiteTransactionType(String str, int i2) {
        }
    }

    Object n(SQLiteTransactionType sQLiteTransactionType, Function2 function2, Continuation continuation);

    Object rl(Continuation continuation);
}
