# ChatGPT team - OOP Summer 2025
## 📚 Library Management System

Library Management System là một phần mềm quản lý thư viện, hỗ trợ tổ chức và quản lý sách, người dùng, cũng như các hoạt động mượn và trả sách.
Phần mềm chỉ bao gồm 1 Actor chính: Librarian.
Hệ thống được xây dựng trong khuôn khổ bài tập lớn môn Lập trình Hướng Đối Tượng (OOP).

## 👥 Coder

- Lê Thành Đạt

- Ngô Văn Kiệt

- Nguyễn Quang Huy

- Nguyễn Thế An

## ⚡ Chức năng chính
Mặc dù dự án chỉ có 1 Actor duy nhất, nhưng chức năng thì sẽ vẫn phân loại theo đặc điểm của 2 Actor bên dưới.
### 1. Admin

- Admin có quyền quản lý toàn bộ hệ thống, bao gồm:

- Quản lý số lượng sách (tổng số, đã mượn, còn lại).

- Quản lý sinh viên: thêm, sửa, xóa thông tin người dùng.

- Quản lý sách: thêm, sửa, xóa thông tin sách.

- Xem và quản lý danh sách mượn/trả sách.

- Theo dõi danh sách người vi phạm (Defaulter List).

- Xem tất cả các bản ghi mượn sách trong hệ thống.

### 2. User

User có thể:

- Đăng ký tài khoản và đăng nhập hệ thống.

- Xem danh mục sách có sẵn trong thư viện.

- Gửi yêu cầu mượn sách.

- Trả sách sau khi sử dụng.

# 🚀 Cài đặt và chạy ứng dụng

- Clone repo này về máy tính cá nhân

- Cấu hình cơ sở dữ liệu:

Nếu dùng XAMPP + MySQL: import file library_ms.sql vào phpMyAdmin.

Nếu dùng SQLite: tạo file library.db và cập nhật chuỗi kết nối trong DBConnection.java.

Trong tệp DBConnection, thay đường dẫn lưu DB bằng đường dẫn tới file DB của bạn.

# Sử dụng:

Mở dự án bằng IDE.

Chạy lớp LoginPage.java hoặc HomePage.java.

# 💻 Công nghệ sử dụng

Ngôn ngữ lập trình: Java

Giao diện: Swing (JFrame, JPanel, …)

IDEA: Netbeans

Cơ sở dữ liệu: MySQL (XAMPP)

