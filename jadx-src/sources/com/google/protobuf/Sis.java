package com.google.protobuf;

import com.google.protobuf.Q;
import com.google.protobuf.g9s;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Sis {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void indent(int i2, StringBuilder sb) {
        while (i2 > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i2 > cArr.length ? cArr.length : i2;
            sb.append(cArr, 0, length);
            i2 -= length;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof C ? obj.equals(C.EMPTY) : obj instanceof yg ? obj == ((yg) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static void printField(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i2, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(qYU.escapeText((String) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof C) {
            sb.append(": \"");
            sb.append(qYU.escapeBytes((C) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof g9s) {
            sb.append(" {");
            reflectivePrintWithIndent((g9s) obj, sb, i2 + 2);
            sb.append("\n");
            indent(i2, sb);
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
        printField(sb, i3, "key", entry.getKey());
        printField(sb, i3, "value", entry.getValue());
        sb.append("\n");
        indent(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void reflectivePrintWithIndent(yg ygVar, StringBuilder sb, int i2) {
        int i3;
        int i5;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ygVar.getClass().getDeclaredMethods();
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
            if (!strSubstring.endsWith(LIST_SUFFIX) || strSubstring.endsWith(BUILDER_LIST_SUFFIX) || strSubstring.equals(LIST_SUFFIX) || (method2 = (Method) entry.getValue()) == null) {
                i5 = i3;
            } else {
                i5 = i3;
                if (method2.getReturnType().equals(List.class)) {
                    printField(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), g9s.invokeOrDie(method2, ygVar, new Object[0]));
                }
                i3 = i5;
            }
            if (!strSubstring.endsWith(MAP_SUFFIX) || strSubstring.equals(MAP_SUFFIX) || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith(BYTES_SUFFIX)) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            Method method4 = (Method) entry.getValue();
                            Method method5 = (Method) map.get("has" + strSubstring);
                            if (method4 != null) {
                                Object objInvokeOrDie = g9s.invokeOrDie(method4, ygVar, new Object[0]);
                                if (method5 == null ? !isDefaultValue(objInvokeOrDie) : ((Boolean) g9s.invokeOrDie(method5, ygVar, new Object[0])).booleanValue()) {
                                    printField(sb, i2, strSubstring, objInvokeOrDie);
                                }
                            }
                        }
                    }
                }
            } else {
                printField(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), g9s.invokeOrDie(method, ygVar, new Object[0]));
            }
            i3 = i5;
        }
        if (ygVar instanceof g9s.Ml) {
            for (Map.Entry<Q.w6, Object> entry2 : ((g9s.Ml) ygVar).extensions) {
                printField(sb, i2, "[" + ((g9s.Wre) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        c7r c7rVar = ((g9s) ygVar).unknownFields;
        if (c7rVar != null) {
            c7rVar.printWithIndent(sb, i2);
        }
    }

    static String toString(yg ygVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        reflectivePrintWithIndent(ygVar, sb, 0);
        return sb.toString();
    }

    private Sis() {
    }

    private static String pascalCaseToSnakeCase(String str) {
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
