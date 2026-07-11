package androidx.constraintlayout.compose;

import java.util.Map;
import kotlin.Metadata;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/constraintlayout/compose/BaseKeyFrameScope$addOnPropertyChange$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BaseKeyFrameScope$addOnPropertyChange$1 extends ObservableProperty<Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ BaseKeyFrameScope f34412n;
    final /* synthetic */ String rl;

    @Override // kotlin.properties.ObservableProperty
    protected void afterChange(KProperty property, Object oldValue, Object newValue) {
        if (newValue != null) {
            Map map = this.f34412n.keyFramePropertiesValue;
            String name = this.rl;
            if (name == null) {
                name = property.getName();
            }
            map.put(name, newValue);
            return;
        }
        Map map2 = this.f34412n.keyFramePropertiesValue;
        String name2 = this.rl;
        if (name2 == null) {
            name2 = property.getName();
        }
        map2.remove(name2);
    }
}
