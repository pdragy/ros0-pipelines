node {
    git url: 'https://github.com/ros-industrial/abb_egm_rws_managers.git', branch: 'master'
    registerROS('ros:jazzy-desktop-full',
        ['ros-jazzy-abb-libegm', 'ros-jazzy-abb-librws'],
        ['ros-jazzy-abb-libegm', 'ros-jazzy-abb-librws']
    )
}
