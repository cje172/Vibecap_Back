package com.example.vibecap_back.global.config.storage;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

public interface ImageService {

    String getImageUrl(String name);

    String uploadFiles(MultipartFile file) throws FileSaveErrorException, IOException;

    String save(BufferedImage bufferedImage, String originalFileName) throws IOException;

    void delete(String name) throws IOException;

    default String getExtension(String originalFileName) {
        return StringUtils.getFilenameExtension(originalFileName);
    }

    default String generateFileName(String originalFileName) {
        return UUID.randomUUID() + getExtension(originalFileName);
    }

    default byte[] getByteArrays(BufferedImage bufferedImage, String format) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(bufferedImage, format, baos);
            baos.flush();

            return baos.toByteArray();
        } catch (IOException e) {
            throw e;
        }
    }

}
