package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
@SourceDebugExtension({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1789#2,3:73\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n*L\n43#1:73,3\n*E\n"})
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements Function2<Object, Continuation<Object>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37379O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ List f37380Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ List f37382o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f37383r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37384t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.f37382o = list;
        this.f37380Z = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f37382o, this.f37380Z, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.f37383r = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Object obj, Continuation continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        DataMigration dataMigration;
        Iterator it2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.J2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    it = (Iterator) this.f37381n;
                    list = (List) this.f37383r;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                obj2 = this.f37379O;
                DataMigration dataMigration2 = (DataMigration) this.f37384t;
                it2 = (Iterator) this.f37381n;
                List list2 = (List) this.f37383r;
                ResultKt.throwOnFailure(obj);
                dataMigration = dataMigration2;
                list = list2;
                if (!((Boolean) obj).booleanValue()) {
                    list.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(dataMigration, null));
                    this.f37383r = list;
                    this.f37381n = it2;
                    this.f37384t = null;
                    this.f37379O = null;
                    this.J2 = 2;
                    obj = dataMigration.t(obj2, this);
                    if (obj != coroutine_suspended) {
                        it = it2;
                    }
                    return coroutine_suspended;
                }
                obj = obj2;
                it = it2;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            obj = this.f37383r;
            List list3 = this.f37382o;
            list = this.f37380Z;
            it = list3.iterator();
        }
        if (!it.hasNext()) {
            DataMigration dataMigration3 = (DataMigration) it.next();
            this.f37383r = list;
            this.f37381n = it;
            this.f37384t = dataMigration3;
            this.f37379O = obj;
            this.J2 = 1;
            Object objN = dataMigration3.n(obj, this);
            if (objN != coroutine_suspended) {
                Iterator it3 = it;
                obj2 = obj;
                obj = objN;
                dataMigration = dataMigration3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return coroutine_suspended;
        }
    }
}
