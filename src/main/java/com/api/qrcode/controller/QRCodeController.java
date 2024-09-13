package com.api.qrcode.controller;

import com.api.qrcode.service.QRCodeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/qr")
public class QRCodeController {
    @Autowired
    private QRCodeGeneratorService qrCodeGeneratorService;

    @GetMapping(value = "/qrcode/{content}", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] generateQrCode(@PathVariable String content) throws IOException {
        int width = 300;
        int height = 300;
        return qrCodeGeneratorService.generateQrCodeImage(content, width, height);
    }
}
