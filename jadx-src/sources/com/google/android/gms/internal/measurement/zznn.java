package com.google.android.gms.internal.measurement;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zznn {
    private static final char[] zza;

    static void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            zzlg zzlgVar = zzlg.zzb;
            sb.append(zzof.zza(new zzlf(((String) obj).getBytes(zzmo.zza))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzlg) {
            sb.append(": \"");
            sb.append(zzof.zza((zzlg) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzme) {
            sb.append(" {");
            zzc((zzme) obj, sb, i2 + 2);
            sb.append("\n");
            zzd(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i5 = i2 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i5, "key", entry.getKey());
        zzb(sb, i5, "value", entry.getValue());
        sb.append("\n");
        zzd(i2, sb);
        sb.append("}");
    }

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zznl zznlVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zznlVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(zznl zznlVar, StringBuilder sb, int i2) {
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznlVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i3 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
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
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zzme.zzcr(method2, zznlVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zzme.zzcr(method, zznlVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzcr = zzme.zzcr(method4, zznlVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzcr instanceof Boolean) {
                            if (((Boolean) objZzcr).booleanValue()) {
                                zzb(sb, i2, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Integer) {
                            if (((Integer) objZzcr).intValue() != 0) {
                            }
                        } else if (objZzcr instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzcr).floatValue()) != 0) {
                            }
                        } else if (!(objZzcr instanceof Double)) {
                            if (objZzcr instanceof String) {
                                zEquals = objZzcr.equals("");
                            } else if (objZzcr instanceof zzlg) {
                                zEquals = objZzcr.equals(zzlg.zzb);
                            } else if (objZzcr instanceof zznl) {
                                if (objZzcr != ((zznl) objZzcr).zzcE()) {
                                }
                            } else if (!(objZzcr instanceof Enum) || ((Enum) objZzcr).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzcr).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) zzme.zzcr(method5, zznlVar, new Object[0])).booleanValue()) {
                    }
                }
            }
            i3 = 3;
        }
        if (zznlVar instanceof zzmb) {
            Iterator itZzc = ((zzmb) zznlVar).zzb.zzc();
            if (itZzc.hasNext()) {
                throw null;
            }
        }
        zzoi zzoiVar = ((zzme) zznlVar).zzc;
        if (zzoiVar != null) {
            zzoiVar.zzj(sb, i2);
        }
    }

    private static void zzd(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(zza, 0, i3);
            i2 -= i3;
        }
    }
}
