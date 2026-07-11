package GR;

import Dj9.w6;
import androidx.view.ViewModel;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.MutableCreationExtras;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: GR.j$j, reason: collision with other inner class name */
    static final class C0124j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f3541n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0124j(Function1 function1) {
            super(1);
            this.f3541n = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModel invoke(Object obj) {
            return (ViewModel) this.f3541n.invoke(obj);
        }
    }

    public static final CreationExtras n(MutableCreationExtras mutableCreationExtras, Function1 callback) {
        Intrinsics.checkNotNullParameter(mutableCreationExtras, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CreationExtras.Key CREATION_CALLBACK_KEY = w6.f1910O;
        Intrinsics.checkNotNullExpressionValue(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        mutableCreationExtras.t(CREATION_CALLBACK_KEY, new C0124j(callback));
        return mutableCreationExtras;
    }

    public static final CreationExtras rl(CreationExtras creationExtras, Function1 callback) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return n(new MutableCreationExtras(creationExtras), callback);
    }
}
