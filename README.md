# OOP-Project
📚 Library Management System (Java + Swing + MySQL)
📝 Giới thiệu

Dự án Library Management System được xây dựng bằng Java (Swing + JDBC) nhằm quản lý hoạt động của một thư viện: quản lý sách, sinh viên, mượn/trả sách, theo dõi tình trạng vi phạm.

Ứng dụng bao gồm giao diện đồ họa trực quan, hỗ trợ người quản lý thư viện thao tác dễ dàng mà không cần truy vấn cơ sở dữ liệu thủ công.

🚀 Tính năng chính

👤 Đăng nhập / Đăng ký tài khoản

🏠 Trang chủ (HomePage): điều hướng đến các module

📖 Quản lý sách (ManageBooks): thêm, sửa, xóa, hiển thị danh sách sách

🎓 Quản lý sinh viên (ManageStudent): thêm, sửa, xóa, hiển thị danh sách sinh viên

📥 Mượn sách (IssueBook): ghi nhận sinh viên mượn sách

📤 Trả sách (ReturnBook): xử lý việc trả sách

📑 Xem chi tiết mượn sách (IssueBookDetails)

📜 Xem toàn bộ bản ghi (ViewAllRecord): mượn + trả

⚠️ Danh sách vi phạm (DefaulterList): sinh viên trả sách quá hạn

🏗️ Kiến trúc hệ thống

Hệ thống chia thành 3 lớp chính:

UI Layer (Swing)

LoginPage, SignupPage, HomePage, ManageBooks, ManageStudent,

IssueBook, ReturnBook, IssueBookDetails, ViewAllRecord, DefaulterList

Data Layer (Entities)

Book, Student, User, IssueRecord, ReturnRecord, Defaulter

Utility Layer

DBConnection (cung cấp kết nối JDBC đến MySQL)
