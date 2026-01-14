node {
    git url: 'https://github.com/ros-industrial/abb_egm_rws_managers.git', branch: 'master'
    registerROS('ros:humble-desktop-full',
        ['libpoco-dev', 'ros-humble-abb-libegm', 'ros-humble-abb-librws'],
        ['ros-humble-abb-libegm', 'ros-humble-abb-librws']
    )
}
