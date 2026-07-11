package kuA;

import com.caoccao.javet.values.V8Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map rl(Object obj, KFunction kFunction, V8Value[] v8ValueArr) {
        int size = obj != null ? kFunction.getParameters().size() - 1 : kFunction.getParameters().size();
        if (v8ValueArr.length > size) {
            throw new IllegalArgumentException(("JS injected method invoked with too many arguments.\nExpected: <= " + size + ",\nReceived: " + v8ValueArr.length).toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<KParameter> it = kFunction.getParameters().iterator();
        if (obj != null) {
            linkedHashMap.put(it.next(), obj);
        }
        for (V8Value v8Value : v8ValueArr) {
            KParameter next = it.next();
            linkedHashMap.put(next, MK.j.O(v8Value, next.getType()));
        }
        ArrayList<KParameter> arrayList = new ArrayList();
        for (KParameter kParameter : kFunction.getParameters()) {
            if (!kParameter.isOptional() && !linkedHashMap.containsKey(kParameter)) {
                arrayList.add(kParameter);
            }
        }
        if (arrayList.isEmpty()) {
            return linkedHashMap;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JS injected method invoked without required arguments.\n");
        sb.append("Missing arguments:\n");
        for (KParameter kParameter2 : arrayList) {
            int index = kParameter2.getIndex();
            if (obj != null) {
                index--;
            }
            String name = kParameter2.getName();
            if (name == null) {
                name = "<unnamed>";
            }
            sb.append("  - #" + index + " " + name + ": " + kParameter2.getType() + "\n");
        }
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
