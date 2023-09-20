package com.guercif.a60hizb.koraa.Utililes;

import android.webkit.MimeTypeMap;

public class Utilites {
    public static String getMimeFromFileName(String fileName) {
        MimeTypeMap map = MimeTypeMap.getSingleton();
        String ext = MimeTypeMap.getFileExtensionFromUrl(fileName);
        return map.getMimeTypeFromExtension(ext);
    }
}
