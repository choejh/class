import logging
#로거 정의
logger = logging.getLogger('main')
#??????????????????????????
stream_handler = logging.StreamHandler()
# 출력 방법을 등록
logger.addHandler(stream_handler)

#logger.setLevel(logging.DEBUG)
# 로깅 레벨 설정
logger.setLevel(logging.WARNING)
# 로깅 정보 출력
logger.debug('틀림!!')
logger.info('처리됐으니 확인하세요!')
logger.warning('조심하세요!')
logger.error('에러발생~!')
logger.critical('프로그램이 사망~!~!')