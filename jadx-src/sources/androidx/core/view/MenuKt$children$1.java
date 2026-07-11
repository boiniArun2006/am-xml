package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/core/view/MenuKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuKt$children$1 implements Sequence<MenuItem> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Menu f36738n;

    @Override // kotlin.sequences.Sequence
    public Iterator<MenuItem> iterator() {
        return MenuKt.n(this.f36738n);
    }
}
