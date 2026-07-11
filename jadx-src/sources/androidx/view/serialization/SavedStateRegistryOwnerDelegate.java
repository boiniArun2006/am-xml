package androidx.view.serialization;

import XA.Ml;
import android.os.Bundle;
import androidx.view.SavedStateRegistry;
import androidx.view.internal.C1640CanonicalName_jvmKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/properties/ReadWriteProperty;", "", "key", "t", "(Ljava/lang/String;)Ljava/lang/Object;", "", "nr", "(Ljava/lang/String;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "rl", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/String;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Landroidx/savedstate/SavedStateRegistry;", c.f62177j, "Landroidx/savedstate/SavedStateRegistry;", "registry", "LXA/Ml;", "LXA/Ml;", "serializer", "Ljava/lang/String;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", j.f63190c, "Lkotlin/Function0;", "O", "Lkotlin/jvm/functions/Function0;", "init", "J2", "Ljava/lang/Object;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SavedStateRegistryOwnerDelegate<T> implements ReadWriteProperty<Object, T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Object value;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function0 init;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SavedStateRegistry registry;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final SavedStateConfiguration configuration;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Ml serializer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle O(SavedStateRegistryOwnerDelegate savedStateRegistryOwnerDelegate) {
        Ml ml = savedStateRegistryOwnerDelegate.serializer;
        Object obj = savedStateRegistryOwnerDelegate.value;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            obj = Unit.INSTANCE;
        }
        return SavedStateEncoderKt.n(ml, obj, savedStateRegistryOwnerDelegate.configuration);
    }

    private final void nr(String key) {
        this.registry.t(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.savedstate.serialization.n
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle n() {
                return SavedStateRegistryOwnerDelegate.O(this.f41906n);
            }
        });
    }

    private final String rl(Object thisRef, KProperty property) {
        String str;
        if (thisRef != null) {
            str = C1640CanonicalName_jvmKt.n(Reflection.getOrCreateKotlinClass(thisRef.getClass())) + '.';
        } else {
            str = "";
        }
        return str + property.getName();
    }

    private final Object t(String key) {
        Bundle bundleN = this.registry.n(key);
        if (bundleN != null) {
            return SavedStateDecoderKt.n(this.serializer, bundleN, this.configuration);
        }
        return null;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public Object getValue(Object thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.value == null) {
            String strRl = this.key;
            if (strRl == null) {
                strRl = rl(thisRef, property);
            }
            nr(strRl);
            Object objT = t(strRl);
            if (objT == null) {
                objT = this.init.invoke();
            }
            this.value = objT;
        }
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return Unit.INSTANCE;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object thisRef, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.value == null) {
            String strRl = this.key;
            if (strRl == null) {
                strRl = rl(thisRef, property);
            }
            nr(strRl);
        }
        this.value = value;
    }
}
