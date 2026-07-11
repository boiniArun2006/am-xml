package androidx.constraintlayout.compose;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/constraintlayout/compose/BaseKeyFrameScope$addNameOnPropertyChange$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", c.f62177j, "(Lkotlin/reflect/KProperty;Landroidx/constraintlayout/compose/NamedPropertyOrValue;Landroidx/constraintlayout/compose/NamedPropertyOrValue;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BaseKeyFrameScope$addNameOnPropertyChange$1 extends ObservableProperty<NamedPropertyOrValue> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f34411n;
    final /* synthetic */ BaseKeyFrameScope rl;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.properties.ObservableProperty
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void afterChange(KProperty property, NamedPropertyOrValue oldValue, NamedPropertyOrValue newValue) {
        String name = this.f34411n;
        if (name == null) {
            name = property.getName();
        }
        if (newValue != null) {
            this.rl.keyFramePropertiesValue.put(name, newValue.getName());
        }
    }
}
