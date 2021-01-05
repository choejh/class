package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

public class MemberLogoutService {

	// 싱글톤
		private MemberLogoutService() {}
		private static MemberLogoutService service = new MemberLogoutService();
		public static MemberLogoutService getInstance() {
			return service;
		}

		public void memberLogout(HttpServletRequest request, HttpServletResponse response) {
			Session.invalidate(); //현재 세션을 소멸 -> 속성까지 소멸 -> loginInfo 데이터는 삭제
			Response.sendRedirect(Request.getContextPath()); // /op
		}
}
