package Kre;

import Kre.I28;
import android.content.Context;
import androidx.content.core.DataStore;
import androidx.content.core.DataStoreFactory;
import com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import java.io.File;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f5866n = j.f5867n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f5867n = new j();

        /* JADX INFO: renamed from: Kre.I28$j$j, reason: collision with other inner class name */
        public static final class C0200j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Moshi f5868n;

            public C0200j(Moshi moshi) {
                this.f5868n = moshi;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final JsonAdapter invoke() {
                return _MoshiKotlinExtensionsKt.adapter(this.f5868n, Reflection.typeOf(SpiderSenseServerSettings.class));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File J2(Context context) {
            return androidx.content.Context.n(context, "spidersense_remote_settings_v2");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DataStore O(final Context context) {
            Moshi moshiBuild = new Moshi.Builder().add((JsonAdapter.Factory) zz.j.n()).build();
            DataStoreFactory dataStoreFactory = DataStoreFactory.f37387n;
            Intrinsics.checkNotNull(moshiBuild);
            return DataStoreFactory.t(dataStoreFactory, new et.j(new et.I28(LazyKt.lazy(new C0200j(moshiBuild)))), null, null, null, new Function0() { // from class: Kre.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.J2(context);
                }
            }, 14, null);
        }

        public final Wre nr(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Wre(LazyKt.lazy(new Function0() { // from class: Kre.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.O(context);
                }
            }), LazyKt.lazy(new Function0() { // from class: Kre.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.Uo(context);
                }
            }));
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DataStore Uo(Context context) {
            return fuX.t(context);
        }
    }

    Object n(Continuation continuation);

    Object rl(SpiderSenseServerSettings spiderSenseServerSettings, Continuation continuation);

    Object t(Continuation continuation);
}
