package kotlin.sequences;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010(\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¨\u0006\u0005"}, d2 = {"Lkotlin/sequences/Sequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Sequence<T> {
    Iterator<T> iterator();
}
