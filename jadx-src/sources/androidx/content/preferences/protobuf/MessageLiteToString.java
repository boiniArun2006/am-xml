package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.GeneratedMessageLite;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class MessageLiteToString {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char[] f38089n;

    static {
        char[] cArr = new char[80];
        f38089n = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String J2(MessageLite messageLite, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        O(messageLite, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O(MessageLite messageLite, StringBuilder sb, int i2) {
        int i3;
        int i5;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i3 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i5 = i3;
            } else {
                i5 = i3;
                if (method2.getReturnType().equals(List.class)) {
                    nr(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), GeneratedMessageLite.nY(method2, messageLite, new Object[0]));
                }
                i3 = i5;
            }
            if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            Method method4 = (Method) entry.getValue();
                            Method method5 = (Method) map.get("has" + strSubstring);
                            if (method4 != null) {
                                Object objNY = GeneratedMessageLite.nY(method4, messageLite, new Object[0]);
                                if (method5 == null ? !rl(objNY) : ((Boolean) GeneratedMessageLite.nY(method5, messageLite, new Object[0])).booleanValue()) {
                                    nr(sb, i2, strSubstring, objNY);
                                }
                            }
                        }
                    }
                }
            } else {
                nr(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), GeneratedMessageLite.nY(method, messageLite, new Object[0]));
            }
            i3 = i5;
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator itZ = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.Z();
            while (itZ.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZ.next();
                nr(sb, i2, "[" + ((GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.az(sb, i2);
        }
    }

    private static void n(int i2, StringBuilder sb) {
        while (i2 > 0) {
            char[] cArr = f38089n;
            int length = i2 > cArr.length ? cArr.length : i2;
            sb.append(cArr, 0, length);
            i2 -= length;
        }
    }

    static void nr(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                nr(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                nr(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        n(i2, sb);
        sb.append(t(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.t((String) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.n((ByteString) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            O((GeneratedMessageLite) obj, sb, i2 + 2);
            sb.append("\n");
            n(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i2 + 2;
        nr(sb, i3, "key", entry.getKey());
        nr(sb, i3, "value", entry.getValue());
        sb.append("\n");
        n(i2, sb);
        sb.append("}");
    }

    private static boolean rl(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof ByteString ? obj.equals(ByteString.f37740t) : obj instanceof MessageLite ? obj == ((MessageLite) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String t(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
